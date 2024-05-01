
package modelVimeo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Privacy {

    @JsonProperty("view")
    private String view;

    @JsonProperty("view")
    public String getView() {
        return view;
    }

    @JsonProperty("view")
    public void setView(String view) {
        this.view = view;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Privacy.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("view");
        sb.append('=');
        sb.append(((this.view == null)?"<null>":this.view));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
