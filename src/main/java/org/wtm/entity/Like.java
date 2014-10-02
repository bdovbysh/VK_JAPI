package org.wtm.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dovbysh on 19.02.14.
 */
public class Like {
    @SerializedName("user_likes")
    private Integer userLikes;
    @SerializedName("count")
    private Integer count;


    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(Integer userLikes) {
        this.userLikes = userLikes;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Like{");
        sb.append("userLikes=").append(userLikes);
        sb.append(", count=").append(count);
        sb.append('}');
        return sb.toString();
    }
}
