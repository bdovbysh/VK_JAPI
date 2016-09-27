package org.wtm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.wtm.entity.Album;
import org.wtm.entity.Online;
import org.wtm.entity.Photo;
import org.wtm.entity.User;
import org.wtm.exceptions.RequestException;
import org.wtm.request.FriendsRequest;
import org.wtm.request.LikeRequest;
import org.wtm.request.PhotoRequest;
import org.wtm.request.UserRequest;
import org.wtm.response.ResponseWithItems;

import java.util.List;

/**
 * Created by dovbysh on 9/23/2016.
 */
public class Application {

    public static void main(String ... args) throws RequestException, InterruptedException {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");



//        FriendsRequest friendsRequest = (FriendsRequest) context.getBean("friendsRequest");
        PhotoRequest request = (PhotoRequest) context.getBean("photoRequest");
        LikeRequest likeRequest = (LikeRequest) context.getBean("likeRequest");
        UserRequest userRequest = (UserRequest) context.getBean("userRequest");

        User user = userRequest.getUsers("",null).get(0);
        List<Album> albumList = request.getAlbums(user.getId());
        String userId = user.getId();
        for (Album album : albumList){
                List<Photo> photos = request.getPhotos(userId, album.getId());
                for (Photo photo : photos) {
                    likeRequest.deleteLike(LikeRequest.Type.photo, user.getId(), photo.getId().toString());
                    Thread.currentThread().sleep(100);
                }
        }
    }

}
