package org.wtm.request;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import org.wtm.entity.Constants;
import org.wtm.entity.Group;
import org.wtm.entity.Subscription;
import org.wtm.entity.User;
import org.wtm.exceptions.RequestException;
import org.wtm.response.ResponseList;
import org.wtm.response.ResponseWithItems;

import java.lang.reflect.Type;
import java.util.List;

import static org.wtm.entity.Constants.FIELDS_PARAM;
import static org.wtm.entity.Constants.NameCase;

/**
 * Created by dovbysh on 11.08.14.
 */
public class Users{

    private final static String USERS_GET = "users.get";
    private final static String FIELDS = "fields";
    private final static String USER_IDS = "user_ids";
    private final static String NAMECASE = "name_case";
    private final static String GET_SUBSCRIPTIONS = "users.getSubscriptions";
    private final static String GET_FOLLOWERS = "users.getFollowers";
    



    private String token;
    private Gson gson;
    private Type userResponse;
    private Type subscriptionResponse;
    private Type userListResponse;

    public Users(){
      //  this.token = token;
        gson = new Gson();
        userResponse = new TypeToken<ResponseList<User>>(){}.getType();
        subscriptionResponse = new TypeToken<ResponseWithItems<Subscription>>(){}.getType();
        userListResponse = new TypeToken<ResponseWithItems<User>>(){}.getType();
    }

    public List<User> getFollowers(String uids) throws RequestException{
    	Request request = new Request(GET_FOLLOWERS);
    	request.addParameter("user_id", uids);
    	request.addParameter("fields",Constants.FIELDS_NO_TOKEN);
    	ResponseWithItems<User> responseList = gson.fromJson(request.makeRequest(),userListResponse);
        return responseList.getResponse().getItems();
    }
    
    /***
     * 
     * @param uids ID's
     * @param count max 20,default 20
     * @param offset
     * @return
     */
    public List<Subscription> getSubscriptions(String uids,Integer count,Integer offset) throws RequestException{
    	Request request = new Request(GET_SUBSCRIPTIONS);
    	request.addParameter("user_id",uids);
    	request.addParameter("count", count);
    	request.addParameter("offset",offset);
    	request.addParameter("extended",1);
    	ResponseWithItems<Subscription> response = gson.fromJson(request.makeRequest(), subscriptionResponse);
    	return response.getResponse().getItems();
    }
    
        
    /***
     *
     * @param uids user id's separate by ','
     * @param nameCase
     * @return
     */
    public List<User> get(String uids,NameCase nameCase) throws RequestException {
        Request request = new Request(USERS_GET);
        request.addParameter(USER_IDS,uids);
        if ( nameCase!=null){
            request.addParameter(NAMECASE,nameCase);
        }
        request.addParameter(FIELDS,FIELDS_PARAM);
        ResponseList<User> responseList = gson.fromJson(request.makeRequest(),userResponse);
        return responseList.getResponse();
    }


}
