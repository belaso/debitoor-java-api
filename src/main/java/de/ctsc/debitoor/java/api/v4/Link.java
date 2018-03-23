
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
 * Link to invoice
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "linkId",
    "type",
    "number",
    "date",
    "amount",
    "currency",
    "unpaidAmountChange"
})
public class Link {

    /**
     * Id of document
     * (Required)
     * 
     */
    @JsonProperty("linkId")
    @JsonPropertyDescription("Id of document")
    private String linkId;
    /**
     * Type of document
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of document")
    private Link.Type type;
    /**
     * Number of invoice
     * 
     */
    @JsonProperty("number")
    @JsonPropertyDescription("Number of invoice")
    private String number;
    /**
     * Date of link
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("Date of link")
    private String date;
    /**
     * Invoice total amount
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Invoice total amount")
    private Double amount;
    /**
     * Invoice currency
     * 
     */
    @JsonProperty("currency")
    @JsonPropertyDescription("Invoice currency")
    private String currency;
    /**
     * The unpaid amount on this expense, has been changed by the amount specified here.
     * 
     */
    @JsonProperty("unpaidAmountChange")
    @JsonPropertyDescription("The unpaid amount on this expense, has been changed by the amount specified here.")
    private Double unpaidAmountChange;

    /**
     * Id of document
     * (Required)
     * 
     */
    @JsonProperty("linkId")
    public String getLinkId() {
        return linkId;
    }

    /**
     * Id of document
     * (Required)
     * 
     */
    @JsonProperty("linkId")
    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    public Link withLinkId(String linkId) {
        this.linkId = linkId;
        return this;
    }

    /**
     * Type of document
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Link.Type getType() {
        return type;
    }

    /**
     * Type of document
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Link.Type type) {
        this.type = type;
    }

    public Link withType(Link.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Number of invoice
     * 
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * Number of invoice
     * 
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    public Link withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Date of link
     * 
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * Date of link
     * 
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    public Link withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Invoice total amount
     * 
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    /**
     * Invoice total amount
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Link withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Invoice currency
     * 
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * Invoice currency
     * 
     */
    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Link withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * The unpaid amount on this expense, has been changed by the amount specified here.
     * 
     */
    @JsonProperty("unpaidAmountChange")
    public Double getUnpaidAmountChange() {
        return unpaidAmountChange;
    }

    /**
     * The unpaid amount on this expense, has been changed by the amount specified here.
     * 
     */
    @JsonProperty("unpaidAmountChange")
    public void setUnpaidAmountChange(Double unpaidAmountChange) {
        this.unpaidAmountChange = unpaidAmountChange;
    }

    public Link withUnpaidAmountChange(Double unpaidAmountChange) {
        this.unpaidAmountChange = unpaidAmountChange;
        return this;
    }

    public enum Type {

        INVOICE("invoice");
        private final String value;
        private final static Map<String, Link.Type> CONSTANTS = new HashMap<String, Link.Type>();

        static {
            for (Link.Type c: values()) {
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
        public static Link.Type fromValue(String value) {
            Link.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
