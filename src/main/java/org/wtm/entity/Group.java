package org.wtm.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dovbysh on 08.08.14.
 */
public class Group {

   private Integer id;
   private String name;
   @SerializedName("screen_name")
   private String screenName;
   private String type;
   @SerializedName("photo_50")
   private String photo50;
   @SerializedName("photo_100")
   private String photo100;
   @SerializedName("photo_200")
   private String photo200;
   @SerializedName("is_admin")
   private Integer isAdmin;
   @SerializedName("is_member")
   private Integer isMember;
   private String description;
   private String site;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getPhoto50() {
        return photo50;
    }

    public void setPhoto50(String photo50) {
        this.photo50 = photo50;
    }

    public String getPhoto100() {
        return photo100;
    }

    public void setPhoto100(String photo100) {
        this.photo100 = photo100;
    }

    public String getPhoto200() {
        return photo200;
    }

    public void setPhoto200(String photo200) {
        this.photo200 = photo200;
    }

    public Integer getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Integer getIsMember() {
        return isMember;
    }

    public void setIsMember(Integer isMember) {
        this.isMember = isMember;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
   public String toString() {
        final StringBuilder sb = new StringBuilder("Group{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", screenName='").append(screenName).append('\'');
        sb.append(", type=").append(type);
        sb.append(", photo50='").append(photo50).append('\'');
        sb.append(", photo100='").append(photo100).append('\'');
        sb.append(", photo200='").append(photo200).append('\'');
        sb.append(", isAdmin=").append(isAdmin);
        sb.append(", isMember=").append(isMember);
        sb.append(", description='").append(description).append('\'');
        sb.append(", site='").append(site).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
