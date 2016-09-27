package org.wtm.request;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.wtm.entity.User;
import org.wtm.exceptions.RequestException;
import org.wtm.response.ResponseList;

import java.lang.reflect.Type;
import java.util.List;

import static org.wtm.entity.Constants.FIELDS_PARAM;
import static org.wtm.entity.Constants.NameCase;

/**
 * Created by dovbysh on 11.08.14.
 */
public class UserRequest {

    private final static String USERS_GET = "users.get";
    private final static String FIELDS = "fields";
    private final static String USER_IDS = "user_ids";
    private final static String NAMECASE = "name_case";


    private Type responseType;
    @Autowired
    private ApplicationContext context;
    @Autowired
    private Gson gson;

    public UserRequest(){
        responseType = new TypeToken<ResponseList<User>>(){}.getType();
    }

    /***
     *
     * @param uids user id's separate by ','
     * @param nameCase
     * @return
     */
    public List<User> getUsers(String uids,NameCase nameCase) throws RequestException {
        Request request = (Request) context.getBean("request");
        request.setMethodName(USERS_GET).addParameter(USER_IDS,uids);
        if ( nameCase!=null){
            request.addParameter(NAMECASE,nameCase);
        }
        request.addParameter(FIELDS,FIELDS_PARAM);
        ResponseList<User> responseList = gson.fromJson(request.makeRequest(),responseType);
        return responseList.getResponse();
    }

    public String getUserFields(){
        return FIELDS_PARAM;
    }


}
