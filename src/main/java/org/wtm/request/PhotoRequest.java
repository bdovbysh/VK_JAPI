package org.wtm.request;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.wtm.entity.Album;
import org.wtm.entity.Photo;
import org.wtm.exceptions.RequestException;
import org.wtm.response.ResponseList;
import org.wtm.response.ResponseObject;
import org.wtm.response.ResponseWithItems;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by dovbysh on 22.09.2016.
 */
public class PhotoRequest {

    private final static String GET_BY_ID = "photos.getById";
    private final static String GET_ALBUMS = "photos.getAlbums";
    private final static String GET_ALBUMS_COUNT = "photos.getAlbumsCount";
    private final static String GET_PHOTOS = "photos.get";

    @Autowired
    private Gson gson;

    @Autowired
    private ApplicationContext context;

    private Type photoListType;
    public PhotoRequest(){
        photoListType = new TypeToken<ResponseList<Photo>>() {}.getType();
    }

    public List<Photo> getById(String photoId) throws RequestException {
        Request request = (Request) context.getBean("request");
        request.setMethodName(GET_BY_ID)
                .addParameter("photos",photoId);
        ResponseList<Photo> responseObject = gson.fromJson(request.makeRequest(),photoListType );
        return responseObject.getResponse();
    }

    /**
     * Get photos from album
     * @param ownerId
     * @param albumId
     * @return
     * @throws RequestException
     */
    public List<Photo> getPhotos(String ownerId, String albumId) throws RequestException{
        photoListType = new TypeToken<ResponseWithItems<Photo>>() {}.getType();
        Request request = (Request) context.getBean("request");
        request.setMethodName(GET_PHOTOS)
                .addParameter("owner_id",ownerId)
                .addParameter("album_id",albumId);
        ResponseWithItems<Photo> responseObject = gson.fromJson(request.makeRequest(),photoListType );
        return responseObject.getResponse().getItems();
    }


    public List<Album> getAlbums(String ownerId) throws RequestException{

        Type responseType = new TypeToken<ResponseWithItems<Album>>(){}.getType();

        Request request = (Request) context.getBean("request");
        request.setMethodName(GET_ALBUMS)
                .addParameter("owner_id", ownerId);

        ResponseWithItems<Album> responseWithItems = gson.fromJson(request.makeRequest(), responseType);
        return responseWithItems.getResponse().getItems();
    }

    public Object getAlbumCount(String ownerId) throws RequestException {
        Type responseType = new TypeToken<ResponseObject<Integer>>(){}.getType();
        Request request = (Request) context.getBean("request");
        request.setMethodName(GET_ALBUMS_COUNT).addParameter("user_id",ownerId);
        ResponseObject<Integer> responseObject = gson.fromJson(request.makeRequest(),responseType);
        return responseObject.getResponse();
    }
}
