
package modelVimeo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Size__1 {

    @JsonProperty("width")
    private Integer width;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("link")
    private String link;
    @JsonProperty("link_with_play_button")
    private String linkWithPlayButton;

    @JsonProperty("width")
    public Integer getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Integer width) {
        this.width = width;
    }

    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    @JsonProperty("link_with_play_button")
    public String getLinkWithPlayButton() {
        return linkWithPlayButton;
    }

    @JsonProperty("link_with_play_button")
    public void setLinkWithPlayButton(String linkWithPlayButton) {
        this.linkWithPlayButton = linkWithPlayButton;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Size__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("width");
        sb.append('=');
        sb.append(((this.width == null)?"<null>":this.width));
        sb.append(',');
        sb.append("height");
        sb.append('=');
        sb.append(((this.height == null)?"<null>":this.height));
        sb.append(',');
        sb.append("link");
        sb.append('=');
        sb.append(((this.link == null)?"<null>":this.link));
        sb.append(',');
        sb.append("linkWithPlayButton");
        sb.append('=');
        sb.append(((this.linkWithPlayButton == null)?"<null>":this.linkWithPlayButton));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
