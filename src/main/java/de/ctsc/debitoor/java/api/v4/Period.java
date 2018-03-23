
package de.ctsc.debitoor.java.api.v4;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Time period of this automatically generated expense
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "from",
    "to"
})
public class Period {

    /**
     * From date
     * (Required)
     * 
     */
    @JsonProperty("from")
    @JsonPropertyDescription("From date")
    private String from;
    /**
     * To date
     * (Required)
     * 
     */
    @JsonProperty("to")
    @JsonPropertyDescription("To date")
    private String to;

    /**
     * From date
     * (Required)
     * 
     */
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    /**
     * From date
     * (Required)
     * 
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    public Period withFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * To date
     * (Required)
     * 
     */
    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    /**
     * To date
     * (Required)
     * 
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    public Period withTo(String to) {
        this.to = to;
        return this;
    }

}
