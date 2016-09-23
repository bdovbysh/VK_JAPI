package org.wtm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

/**
 * Created by dovbysh on 9/23/2016.
 */
public class Application {

    public static void main(String ... args){

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Properties authorizationProps = (Properties) context.getBean("authorizationProps");
        String token = authorizationProps.getProperty("token");


    }

}
