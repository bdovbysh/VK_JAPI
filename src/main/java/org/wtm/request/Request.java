package org.wtm.request;

import org.apache.commons.io.IOUtils;
import org.wtm.exceptions.RequestException;

import java.net.URL;

/**
 * Created by dovbysh on 08.08.14.
 */
public class Request {

    private final static String API_URL = "https://api.vk.com/method/";
    private final static String API_VERSION = "5.25";
    private StringBuilder query;

    /**
     * Methods with authentication
     * @param methodName
     */
    public Request (String methodName,String token){
        this();
        query.append(methodName).append("?");
        query.append("access_token=").append(token);
        query.append("&v=").append(API_VERSION);
    }

    /**
     * Methods without authentication
     * @param methodName
     */
    public Request(String methodName){
        this();
        query.append(methodName).append("?");
        query.append("&v=").append(API_VERSION);
    }

    private Request(){
        query = new StringBuilder().append(API_URL);
    }

    /**
     * Add parameter to query with key & value separately
     * @param key
     * @param value
     * @return
     */
    public Request addParameter(String key,Object value){
        query.append("&").append(key).append("=").append(value);
        return this;
    }

    protected String getQuery(){
        return query.toString();
    }

    public String makeRequest() throws RequestException {
        try{
            String request = getQuery();
            return IOUtils.toString(new URL(request));
        }
        catch(Exception e){
            throw new RequestException(e);
        }
    }

}
