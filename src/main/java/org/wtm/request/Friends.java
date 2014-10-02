package org.wtm.request;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.wtm.entity.Constants;
import org.wtm.entity.User;
import org.wtm.exceptions.RequestException;
import org.wtm.response.ResponseWithItems;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by dovbysh on 01.10.14.
 */
public   class Friends {

    private final String token;
    private Gson gson;
    private Type responseType;

    public Friends(String token){
        this.token = token;
        gson = new Gson();
        responseType = new TypeToken<ResponseWithItems<User>>(){}.getType();
    }
    private final static String GET_SUGGESTIONS = "friends.getSuggestions";

    public  void getOnline() {};
    public  void get() {};
    public  void getMutal() {};
    public  void getRecent() {};

    /**
     *
     * @param count max = 500
     * @param offset
     */
    public List<User> getSuggestions(Integer count,Integer offset,Boolean allFields) throws RequestException {
        if ( count < 0 || count > 500 || offset < 0 || offset > 500){
            throw new IllegalArgumentException("Count should be >= 0 & <= 500 OR offset") ;
        }
        Request request = new Request(GET_SUGGESTIONS,token);

        request.addParameter("count",count);
        request.addParameter("offset",offset);
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
        Request request = new Request(GET_SUGGESTIONS,token);
        ResponseWithItems<User> responseWithItems = gson.fromJson(request.makeRequest(),responseType);
        return responseWithItems.getResponse().getItems();
    }

    public  Boolean areFriends() {
        return false;
    }

    public  void add() {

    };



}
