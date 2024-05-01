
package modelVimeo;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Connections__1 {

    @JsonProperty("users")
    private Users users;
    @JsonProperty("videos")
    private Videos__1 videos;

    @JsonProperty("users")
    public Users getUsers() {
        return users;
    }

    @JsonProperty("users")
    public void setUsers(Users users) {
        this.users = users;
    }

    @JsonProperty("videos")
    public Videos__1 getVideos() {
        return videos;
    }

    @JsonProperty("videos")
    public void setVideos(Videos__1 videos) {
        this.videos = videos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Connections__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("users");
        sb.append('=');
        sb.append(((this.users == null)?"<null>":this.users));
        sb.append(',');
        sb.append("videos");
        sb.append('=');
        sb.append(((this.videos == null)?"<null>":this.videos));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
