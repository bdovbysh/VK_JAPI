package org.wtm.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dovbysh on 19.02.14.
 */
public class Photo {

    private Integer id;
    private Integer album_id;
    @SerializedName("owner_id")
    private Integer ownerID;
    @SerializedName("photo_75")
    private String photo75;
    @SerializedName("photo_130")
    private String photo130;
    @SerializedName("photo_604")
    private String photo604;
    @SerializedName("photo_807")
    private String photo807;
    @SerializedName("photo_1280")
    private String photo1280;
    @SerializedName("photo_2650")
    private String photo2560;
    private Integer width;
    private Integer height;
    private Long date;
    @SerializedName("likes")
    private Like like;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(Integer album_id) {
        this.album_id = album_id;
    }

    public Integer getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(Integer ownerID) {
        this.ownerID = ownerID;
    }

    public String getPhoto75() {
        return photo75;
    }

    public void setPhoto75(String photo75) {
        this.photo75 = photo75;
    }

    public String getPhoto130() {
        return photo130;
    }

    public void setPhoto130(String photo130) {
        this.photo130 = photo130;
    }

    public String getPhoto604() {
        return photo604;
    }

    public void setPhoto604(String photo604) {
        this.photo604 = photo604;
    }

    public String getPhoto807() {
        return photo807;
    }

    public void setPhoto807(String photo807) {
        this.photo807 = photo807;
    }

    public String getPhoto1280() {
        return photo1280;
    }

    public void setPhoto1280(String photo1280) {
        this.photo1280 = photo1280;
    }

    public String getPhoto2560() {
        return photo2560;
    }

    public void setPhoto2560(String photo2560) {
        this.photo2560 = photo2560;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public Like getLike() {
        return like;
    }

    public void setLike(Like like) {
        this.like = like;
    }


    public String getMaxPhoto(){
        if (photo2560!=null)
            return photo2560;
        else if ( photo1280!=null)
            return photo1280;
        else if (photo807!=null)
            return photo807;
        else if (photo604!=null)
            return photo604;
        else if (photo130!=null)
            return photo130;
        else if (photo75!=null)
            return photo75;
        return null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Photo{");
        sb.append("id=").append(id);
        sb.append(", album_id=").append(album_id);
        sb.append(", ownerID=").append(ownerID);
        sb.append(", photo75='").append(photo75).append('\'');
        sb.append(", photo130='").append(photo130).append('\'');
        sb.append(", photo604='").append(photo604).append('\'');
        sb.append(", photo807='").append(photo807).append('\'');
        sb.append(", photo1280='").append(photo1280).append('\'');
        sb.append(", photo2560='").append(photo2560).append('\'');
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", date=").append(date);
        sb.append(", like=").append(like);
        sb.append('}');
        return sb.toString();
    }
}
