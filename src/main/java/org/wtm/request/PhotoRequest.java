package org.wtm.request;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.wtm.entity.Group;
import org.wtm.entity.Photo;
import org.wtm.exceptions.RequestException;
import org.wtm.response.ResponseList;
import org.wtm.response.ResponseObject;
import org.wtm.response.ResponseWithItems;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by Bohdan on 22.09.2016.
 */
public class PhotoRequest {

    private final static String GET_BY_ID = "photos.getById";

    private String token;
    private Gson gson;

    public PhotoRequest(String token){
        this.token = token;
        gson = new Gson();

    }

    public List<Photo> getById(String photoId) throws RequestException {
        Type responseType = new TypeToken<ResponseList<Photo>>() {}.getType();
        Request request = new Request(GET_BY_ID,token);
        request.addParameter("photos",photoId);
        System.out.println(request.makeRequest());
        ResponseList<Photo> responseObject = gson.fromJson(request.makeRequest(),responseType );
        return responseObject.getResponse();
    }
}
