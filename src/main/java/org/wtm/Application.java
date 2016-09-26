package org.wtm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.wtm.entity.Album;
import org.wtm.entity.Photo;
import org.wtm.exceptions.RequestException;
import org.wtm.request.PhotoRequest;

import java.util.List;

/**
 * Created by dovbysh on 9/23/2016.
 */
public class Application {

    public static void main(String ... args) throws RequestException {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        PhotoRequest request = (PhotoRequest) context.getBean("photoRequest");


    }

}
