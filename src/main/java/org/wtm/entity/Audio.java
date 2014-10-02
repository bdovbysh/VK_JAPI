package org.wtm.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dovbysh on 28.02.14.
 */
public class Audio {

    private Integer id;
    @SerializedName("owner_id")
    Integer ownerID;
    private String artist;
    private String title;
    private Integer duration;
    String url;
    @SerializedName("lyrics_id")
    private Integer lyricsID;
    @SerializedName("genre_id")
    private Integer genreID;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(Integer ownerID) {
        this.ownerID = ownerID;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getLyricsID() {
        return lyricsID;
    }

    public void setLyricsID(Integer lyricsID) {
        this.lyricsID = lyricsID;
    }

    public Integer getGenreID() {
        return genreID;
    }

    public void setGenreID(Integer genreID) {
        this.genreID = genreID;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Audio{");
        sb.append("id=").append(id);
        sb.append(", ownerID=").append(ownerID);
        sb.append(", artist='").append(artist).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", duration=").append(duration);
        sb.append(", url='").append(url).append('\'');
        sb.append(", lyricsID=").append(lyricsID);
        sb.append(", genreID=").append(genreID);
        sb.append('}');
        return sb.toString();
    }
}
