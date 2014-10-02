package org.wtm.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by dovbysh on 02.10.14.
 */
public class Online {


    private List<String> online;
    @SerializedName("online_mobile")
    private List<String> onlineMobile;


    public List<String> getOnline() {
        return online;
    }

    public void setOnline(List<String> online) {
        this.online = online;
    }


    public List<String> getOnlineMobile() {
        return onlineMobile;
    }

    public void setOnlineMobile(List<String> onlineMobile) {
        this.onlineMobile = onlineMobile;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Online{");
        sb.append("online=").append(online);
        sb.append(", onlineMobile=").append(onlineMobile);
        sb.append('}');
        return sb.toString();
    }

}
