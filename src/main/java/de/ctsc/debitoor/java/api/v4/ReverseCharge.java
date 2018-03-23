
package de.ctsc.debitoor.java.api.v4;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Reverse charge details for non domestic purchase from one EU country to another (intraEu purchase)
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "taxRate",
    "taxAmount",
    "productOrService",
    "consumptionOrResale"
})
public class ReverseCharge {

    /**
     * Reverse charge vat rate in percent. Required for non domestic purchase from one EU country to another (intraEu purchase). Not allowed for all other purchases
     * (Required)
     * 
     */
    @JsonProperty("taxRate")
    @JsonPropertyDescription("Reverse charge vat rate in percent. Required for non domestic purchase from one EU country to another (intraEu purchase). Not allowed for all other purchases")
    private Double taxRate;
    /**
     * Reverse charge vat amount. Read only, will be recalculated by server on POST and PUT
     * 
     */
    @JsonProperty("taxAmount")
    @JsonPropertyDescription("Reverse charge vat amount. Read only, will be recalculated by server on POST and PUT")
    private Double taxAmount;
    /**
     * Is this a product or service? Required for non domestic purchase from one EU country to another (intraEu purchase). Not allowed for all other purchases
     * (Required)
     * 
     */
    @JsonProperty("productOrService")
    @JsonPropertyDescription("Is this a product or service? Required for non domestic purchase from one EU country to another (intraEu purchase). Not allowed for all other purchases")
    private String productOrService;
    /**
     * Is this for consumption or resale? Required for non domestic purchase from one EU country to another (intraEu purchase). Not allowed for all other purchases
     * (Required)
     * 
     */
    @JsonProperty("consumptionOrResale")
    @JsonPropertyDescription("Is this for consumption or resale? Required for non domestic purchase from one EU country to another (intraEu purchase). Not allowed for all other purchases")
    private String consumptionOrResale;

    /**
     * Reverse charge vat rate in percent. Required for non domestic purchase from one EU country to another (intraEu purchase). Not allowed for all other purchases
     * (Required)
     * 
     */
    @JsonProperty("taxRate")
    public Double getTaxRate() {
        return taxRate;
    }

    /**
     * Reverse charge vat rate in percent. Required for non domestic purchase from one EU country to another (intraEu purchase). Not allowed for all other purchases
     * (Required)
     * 
     */
    @JsonProperty("taxRate")
    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public ReverseCharge withTaxRate(Double taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     * Reverse charge vat amount. Read only, will be recalculated by server on POST and PUT
     * 
     */
    @JsonProperty("taxAmount")
    public Double getTaxAmount() {
        return taxAmount;
    }

    /**
     * Reverse charge vat amount. Read only, will be recalculated by server on POST and PUT
     * 
     */
    @JsonProperty("taxAmount")
    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public ReverseCharge withTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }

    /**
     * Is this a product or service? Required for non domestic purchase from one EU country to another (intraEu purchase). Not allowed for all other purchases
     * (Required)
     * 
     */
    @JsonProperty("productOrService")
    public String getProductOrService() {
        return productOrService;
    }

    /**
     * Is this a product or service? Required for non domestic purchase from one EU country to another (intraEu purchase). Not allowed for all other purchases
     * (Required)
     * 
     */
    @JsonProperty("productOrService")
    public void setProductOrService(String productOrService) {
        this.productOrService = productOrService;
    }

    public ReverseCharge withProductOrService(String productOrService) {
        this.productOrService = productOrService;
        return this;
    }

    /**
     * Is this for consumption or resale? Required for non domestic purchase from one EU country to another (intraEu purchase). Not allowed for all other purchases
     * (Required)
     * 
     */
    @JsonProperty("consumptionOrResale")
    public String getConsumptionOrResale() {
        return consumptionOrResale;
    }

    /**
     * Is this for consumption or resale? Required for non domestic purchase from one EU country to another (intraEu purchase). Not allowed for all other purchases
     * (Required)
     * 
     */
    @JsonProperty("consumptionOrResale")
    public void setConsumptionOrResale(String consumptionOrResale) {
        this.consumptionOrResale = consumptionOrResale;
    }

    public ReverseCharge withConsumptionOrResale(String consumptionOrResale) {
        this.consumptionOrResale = consumptionOrResale;
        return this;
    }

}
