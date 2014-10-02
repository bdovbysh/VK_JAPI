package org.wtm.entity;

/**
 * Created by Darkart on 17.02.14.
 */
public class LastSeen {

    private Long time;
    private Integer platform;

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LastSeen{");
        sb.append("time=").append(time);
        sb.append(", platform=").append(platform);
        sb.append('}');
        return sb.toString();
    }
}
