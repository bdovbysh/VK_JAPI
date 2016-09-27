package org.wtm.response;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by dovbysh on 9/27/2016.
 */
public class LikeResponse {

    private Integer likes;

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("likes", likes)
                .toString();
    }
}
