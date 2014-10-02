package org.wtm.response;

/**
 * Created by dovbysh on 02.10.14.
 */
public class ResponseObject<T> {

    private T response;

    public void setResponse(T response){
        this.response = response;
    }

    public T getResponse(){
        return response;
    }
}
