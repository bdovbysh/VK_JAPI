package org.wtm.request;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.wtm.entity.Group;
import org.wtm.exceptions.RequestException;
import org.wtm.response.ResponseList;
import org.wtm.response.ResponseWithItems;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by dovbysh on 08.08.14.
 */
public class Groups {

    private final static String GET_BY_ID_METHOD = "groups.getById";
    private final static String GET_MEMBERS = "groups.getMembers";
    private final static String GROUP_IDS = "group_ids";
    private final static String USER_ID = "user_id";
    private final static String GROUP_ID = "group_id";
    private final static String GROUPS_SEARCH = "groups.search";
    private final static String VERSION = "5.24";
    private Gson gson;

    @Autowired
    private ApplicationContext context;

    public Groups(){
        gson = new Gson();
    }

    public List<Group> getByID(String groupID) throws RequestException{
      Type responseType = new TypeToken<ResponseList<Group>>() {}.getType();
        Request request = (Request) context.getBean("request");
      request.setMethodName(GET_BY_ID_METHOD).addParameter(GROUP_IDS,groupID).addParameter("v",VERSION);
      ResponseList responseList = gson.fromJson(request.makeRequest(), responseType);
      return responseList.getResponse();
    }

    public List<Group> groupSearch(String query,Integer offset,Integer count) throws RequestException{
        Type responseType = new TypeToken<ResponseWithItems<Group>>() {}.getType();
        Request request = (Request) context.getBean("request");
        request.setMethodName(GROUPS_SEARCH)
        .addParameter("q",query)
        .addParameter("offset",offset)
        .addParameter("count",count);
        ResponseWithItems responseList = gson.fromJson(request.makeRequest(),responseType);
        return responseList.getResponse().getItems();
    }

    public List<Group> groupSearch(String query) throws RequestException{
        Type responseType = new TypeToken<ResponseWithItems<Group>>() {}.getType();
        Request request = (Request) context.getBean("request");
        request.setMethodName(GROUPS_SEARCH).addParameter("q",query);
        ResponseWithItems responseList = gson.fromJson(request.makeRequest(),responseType);
        return responseList.getResponse().getItems();
    }


    public List<Integer> getMembers(Integer group_id) throws RequestException{
       Type responseType = new TypeToken<ResponseWithItems<Integer>>(){}.getType();
       Request request = (Request) context.getBean("request");
       request.setMethodName(GET_MEMBERS).addParameter(GROUP_ID,group_id);
       ResponseWithItems responseList = gson.fromJson(request.makeRequest(),responseType);
       return responseList.getResponse().getItems();
    }

    public List<Integer> getMembers(Integer group_id,Integer offset,Integer count) throws RequestException{
        Type responseType = new TypeToken<ResponseWithItems<Integer>>(){}.getType();
        Request request = (Request) context.getBean("request");
        request.setMethodName(GET_MEMBERS).addParameter(GROUP_ID,group_id).addParameter("offset",offset).addParameter("count",count);
        ResponseWithItems responseList = gson.fromJson(request.makeRequest(),responseType);
        return responseList.getResponse().getItems();
    }
}
