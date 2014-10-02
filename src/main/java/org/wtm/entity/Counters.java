package org.wtm.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Darkart on 17.02.14.
 */
public class Counters {

    private Integer albums;
    private Integer videos;
    private Integer audios;
    private Integer notes;
    private Integer photos;
    private Integer groups;
    private Integer friends;
    @SerializedName("online_friends")
    private Integer onlineFriends;
    @SerializedName("mutual_friends")
    private Integer mutualFriends;
    @SerializedName("user_photos")
    private Integer userPhotos;
    @SerializedName("user_videos")
    private Integer userVideos;
    private Integer followers;
    private Integer subscriptions;
    private Integer pages;

    public Integer getVideos() {
        return videos;
    }

    public void setVideos(Integer videos) {
        this.videos = videos;
    }

    public Integer getAlbums() {
        return albums;
    }

    public void setAlbums(Integer albums) {
        this.albums = albums;
    }

    public Integer getAudios() {
        return audios;
    }

    public void setAudios(Integer audios) {
        this.audios = audios;
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    public Integer getFriends() {
        return friends;
    }

    public void setFriends(Integer friends) {
        this.friends = friends;
    }

    public Integer getGroups() {
        return groups;
    }

    public void setGroups(Integer groups) {
        this.groups = groups;
    }

    public Integer getMutualFriends() {
        return mutualFriends;
    }

    public void setMutualFriends(Integer mutualFriends) {
        this.mutualFriends = mutualFriends;
    }

    public Integer getNotes() {
        return notes;
    }

    public void setNotes(Integer notes) {
        this.notes = notes;
    }

    public Integer getOnlineFriends() {
        return onlineFriends;
    }

    public void setOnlineFriends(Integer onlineFriends) {
        this.onlineFriends = onlineFriends;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getPhotos() {
        return photos;
    }

    public void setPhotos(Integer photos) {
        this.photos = photos;
    }

    public Integer getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(Integer subscriptions) {
        this.subscriptions = subscriptions;
    }

    public Integer getUserPhotos() {
        return userPhotos;
    }

    public void setUserPhotos(Integer userPhotos) {
        this.userPhotos = userPhotos;
    }

    public Integer getUserVideos() {
        return userVideos;
    }

    public void setUserVideos(Integer userVideos) {
        this.userVideos = userVideos;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Counters{");
        sb.append("albums=").append(albums);
        sb.append(", videos=").append(videos);
        sb.append(", audios=").append(audios);
        sb.append(", notes=").append(notes);
        sb.append(", photos=").append(photos);
        sb.append(", groups=").append(groups);
        sb.append(", friends=").append(friends);
        sb.append(", onlineFriends=").append(onlineFriends);
        sb.append(", mutualFriends=").append(mutualFriends);
        sb.append(", userPhotos=").append(userPhotos);
        sb.append(", userVideos=").append(userVideos);
        sb.append(", followers=").append(followers);
        sb.append(", subscriptions=").append(subscriptions);
        sb.append(", pages=").append(pages);
        sb.append('}');
        return sb.toString();
    }
}
