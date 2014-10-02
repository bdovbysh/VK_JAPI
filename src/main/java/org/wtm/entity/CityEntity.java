package org.wtm.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Darkart on 08.02.14.
 */
public class CityEntity {

    @SerializedName("id")
    private Integer id;
    @SerializedName("title")
    private String title;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CityEntity{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
