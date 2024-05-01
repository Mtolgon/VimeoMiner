
package modelVimeo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Metadata__1 {

    @JsonProperty("connections")
    private Connections__1 connections;
    @JsonProperty("interactions")
    private Object interactions;

    @JsonProperty("connections")
    public Connections__1 getConnections() {
        return connections;
    }

    @JsonProperty("connections")
    public void setConnections(Connections__1 connections) {
        this.connections = connections;
    }

    @JsonProperty("interactions")
    public Object getInteractions() {
        return interactions;
    }

    @JsonProperty("interactions")
    public void setInteractions(Object interactions) {
        this.interactions = interactions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Metadata__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("connections");
        sb.append('=');
        sb.append(((this.connections == null)?"<null>":this.connections));
        sb.append(',');
        sb.append("interactions");
        sb.append('=');
        sb.append(((this.interactions == null)?"<null>":this.interactions));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
