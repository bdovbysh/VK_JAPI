package org.wtm.response;

import java.util.List;

/**
 * Created by dovbysh on 08.08.14.
 */
public class ResponseList<T> {

    private List<T> response;

    public void setResponse(List<T> response){
        this.response = response;
    }

    public List<T> getResponse(){
        return response;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ResponseList{");
        sb.append("response=").append(response);
        sb.append('}');
        return sb.toString();
    }
}
