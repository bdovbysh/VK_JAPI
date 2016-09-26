package org.wtm.entity;

import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by dovbysh on 9/23/2016.
 */
public class Album {

    private String id;
    @SerializedName("thumb_id")
    private Integer thumbId;
    @SerializedName("owner_id")
    private Integer ownerId;
    private String title;
    private String description;
    private String created;
    private String updated;

    private Integer size;

    @SerializedName("thumb_is_last")
    private Integer thumbIsLast;
    @SerializedName("privacy_view")
    private String[] privacyView;

    @SerializedName("privacy_commnet")
    private String[] privacyComment;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getThumbId() {
        return thumbId;
    }

    public void setThumbId(Integer thumbId) {
        this.thumbId = thumbId;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getThumbIsLast() {
        return thumbIsLast;
    }

    public void setThumbIsLast(Integer thumbIsLast) {
        this.thumbIsLast = thumbIsLast;
    }

    public String[] getPrivacyView() {
        return privacyView;
    }

    public void setPrivacyView(String[] privacyView) {
        this.privacyView = privacyView;
    }

    public String[] getPrivacyComment() {
        return privacyComment;
    }

    public void setPrivacyComment(String[] privacyComment) {
        this.privacyComment = privacyComment;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("thumbId", thumbId)
                .append("ownerId", ownerId)
                .append("title", title)
                .append("description", description)
                .append("created", created)
                .append("updated", updated)
                .append("size", size)
                .append("thumbIsLast", thumbIsLast)
                .append("privacyView", privacyView)
                .append("privacyComment", privacyComment)
                .toString();
    }
}
