package org.wtm.request;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.wtm.exceptions.RequestException;
import org.wtm.response.ErrorResponse;
import org.wtm.response.LikeResponse;
import org.wtm.response.ErrorResponse.Error;

/**
 * Created by dovbysh on 9/27/2016.
 */
public class LikeRequest {

    private final static String LIKES_ADD = "likes.add";
    private final static String LIKES_DELETE = "likes.delete";

    public enum Type {post,
        comment ,
        photo ,
        audio ,
        video ,
        note ,
        market,
        photo_comment ,
        video_comment,
        topic_comment ,
        market_comment
    }


    @Autowired
    private ApplicationContext context;

    @Autowired Gson gson;

    public LikeResponse addLike(Type likeType,String ownerId, String itemId) throws RequestException {
        Request request = (Request) context.getBean("request");
        request.setMethodName(LIKES_ADD)
                .addParameter("type", likeType)
                .addParameter("owner_id",ownerId)
                .addParameter("item_id",itemId);
        return gson.fromJson(request.makeRequest(), LikeResponse.class);
    }

    public Object deleteLike(Type likeType,String ownerId, String itemId) throws RequestException {
        Request request = (Request) context.getBean("request");
        request.setMethodName(LIKES_DELETE)
                .addParameter("type",likeType)
                .addParameter("owner_id",ownerId)
                .addParameter("item_id",itemId);

        LikeResponse likeResponse = gson.fromJson(request.makeRequest(), LikeResponse.class);
        if ( likeResponse !=null && likeResponse.getLikes() == null){
            return gson.fromJson(request.makeRequest(), ErrorResponse.class);
        }
        return likeResponse;
    }

}


