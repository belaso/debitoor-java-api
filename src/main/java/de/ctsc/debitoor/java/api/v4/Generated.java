
package de.ctsc.debitoor.java.api.v4;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Additional information if this expense was automatically generated
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "accountId",
    "accountName",
    "period"
})
public class Generated {

    /**
     * Type of this automatically generated expense
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of this automatically generated expense")
    private Generated.Type type;
    /**
     * Id of associated payment account
     * 
     */
    @JsonProperty("accountId")
    @JsonPropertyDescription("Id of associated payment account")
    private String accountId;
    /**
     * Name of associated payment account if requested by ?expand=generated
     * 
     */
    @JsonProperty("accountName")
    @JsonPropertyDescription("Name of associated payment account if requested by ?expand=generated")
    private String accountName;
    /**
     * Time period of this automatically generated expense
     * 
     */
    @JsonProperty("period")
    @JsonPropertyDescription("Time period of this automatically generated expense")
    private Period period;

    /**
     * Type of this automatically generated expense
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Generated.Type getType() {
        return type;
    }

    /**
     * Type of this automatically generated expense
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Generated.Type type) {
        this.type = type;
    }

    public Generated withType(Generated.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Id of associated payment account
     * 
     */
    @JsonProperty("accountId")
    public String getAccountId() {
        return accountId;
    }

    /**
     * Id of associated payment account
     * 
     */
    @JsonProperty("accountId")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Generated withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Name of associated payment account if requested by ?expand=generated
     * 
     */
    @JsonProperty("accountName")
    public String getAccountName() {
        return accountName;
    }

    /**
     * Name of associated payment account if requested by ?expand=generated
     * 
     */
    @JsonProperty("accountName")
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Generated withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Time period of this automatically generated expense
     * 
     */
    @JsonProperty("period")
    public Period getPeriod() {
        return period;
    }

    /**
     * Time period of this automatically generated expense
     * 
     */
    @JsonProperty("period")
    public void setPeriod(Period period) {
        this.period = period;
    }

    public Generated withPeriod(Period period) {
        this.period = period;
        return this;
    }

    public enum Type {

        PAYMENT_FEES("paymentFees");
        private final String value;
        private final static Map<String, Generated.Type> CONSTANTS = new HashMap<String, Generated.Type>();

        static {
            for (Generated.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Generated.Type fromValue(String value) {
            Generated.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
