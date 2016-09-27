package org.wtm.request;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.wtm.entity.Constants;
import org.wtm.entity.Online;
import org.wtm.entity.User;
import org.wtm.exceptions.InputParameterException;
import org.wtm.exceptions.RequestException;
import org.wtm.response.ResponseObject;
import org.wtm.response.ResponseWithItems;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by dovbysh on 01.10.14.
 */
public   class FriendsRequest {

    private Type responseType;
    private Type onlineResponse;

    @Autowired
    private ApplicationContext context;
    @Autowired
    private Gson gson;

    public FriendsRequest(){
        gson = new Gson();
        responseType = new TypeToken<ResponseWithItems<User>>(){}.getType();
        onlineResponse = new TypeToken<ResponseObject<Online>>(){}.getType();
    }

    private final static String GET_SUGGESTIONS = "friends.getSuggestions";
    private final static String GET_ONLINE = "friends.getOnline";

    /**
     * Online friends for current user
     */
    public Online getOnline() throws RequestException {
        Request request = (Request) context.getBean("request");
        request.setMethodName(GET_ONLINE).addParameter("online_mobile",1);
        ResponseObject<Online> response = gson.fromJson(request.makeRequest(),onlineResponse);
        return response.getResponse();
    }

    /**
     *
     * @param user_id
     * @param count
     * @param offset
     */
    public Online getOnline(String user_id,Integer count,Integer offset) throws RequestException,InputParameterException{
        Request request = (Request) context.getBean("request");
        request.setMethodName(GET_ONLINE).addParameter("user_id",user_id).addParameter("online_mobile",1).addParameter("count",count).addParameter("offset",offset);
        ResponseObject<Online> response = gson.fromJson(request.makeRequest(),onlineResponse);
        return response.getResponse();
    }

    public  void get() {}
    public  void getMutal() {}
    public  void getRecent() {}

    /**
     *
     * @param count max = 500
     * @param offset
     */
    public List<User> getSuggestions(Integer count,Integer offset,Boolean allFields) throws RequestException,InputParameterException {
        if ( count < 0 || count > 500 || offset < 0 || offset > 500){
            throw new InputParameterException("Count should be >= 0 & <= 500 OR offset") ;
        }
        Request request = (Request) context.getBean("request");
        request.setMethodName(GET_SUGGESTIONS).addParameter("count",count).addParameter("offset",offset);
        if ( allFields ){
          request.addParameter("fields", Constants.FIELDS_PARAM);
        }
        ResponseWithItems<User> responseWithItems = gson.fromJson(request.makeRequest(),responseType);
        return responseWithItems.getResponse().getItems();
    }

    /**
     * Default suggestions count = 100;
     */
    public List<User> getSuggestions() throws RequestException{
        Request request = (Request) context.getBean("request");
        request.setMethodName(GET_SUGGESTIONS);
        ResponseWithItems<User> responseWithItems = gson.fromJson(request.makeRequest(),responseType);
        return responseWithItems.getResponse().getItems();
    }

    public  Boolean areFriends() {
        return false;
    }


}
