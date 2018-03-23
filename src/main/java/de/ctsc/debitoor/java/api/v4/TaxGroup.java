
package de.ctsc.debitoor.java.api.v4;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A tax group
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "taxRate",
    "netAmount",
    "taxAmount",
    "baseCurrencyNetAmount",
    "baseCurrencyTaxAmount"
})
public class TaxGroup {

    /**
     * The tax group name
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The tax group name")
    private String name;
    /**
     * The tax rate for this group
     * (Required)
     * 
     */
    @JsonProperty("taxRate")
    @JsonPropertyDescription("The tax rate for this group")
    private Double taxRate;
    /**
     * The net amount for this group
     * (Required)
     * 
     */
    @JsonProperty("netAmount")
    @JsonPropertyDescription("The net amount for this group")
    private Double netAmount;
    /**
     * The tax amount for this group
     * (Required)
     * 
     */
    @JsonProperty("taxAmount")
    @JsonPropertyDescription("The tax amount for this group")
    private Double taxAmount;
    /**
     * The net amount for this group in base currency. Will be calculated only for documents in foreign currency.
     * 
     */
    @JsonProperty("baseCurrencyNetAmount")
    @JsonPropertyDescription("The net amount for this group in base currency. Will be calculated only for documents in foreign currency.")
    private Double baseCurrencyNetAmount;
    /**
     * The net deduction amount for this group in base currency. Will be calculated only for documents in foreign currency.
     * 
     */
    @JsonProperty("baseCurrencyTaxAmount")
    @JsonPropertyDescription("The net deduction amount for this group in base currency. Will be calculated only for documents in foreign currency.")
    private Double baseCurrencyTaxAmount;

    /**
     * The tax group name
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The tax group name
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public TaxGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The tax rate for this group
     * (Required)
     * 
     */
    @JsonProperty("taxRate")
    public Double getTaxRate() {
        return taxRate;
    }

    /**
     * The tax rate for this group
     * (Required)
     * 
     */
    @JsonProperty("taxRate")
    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public TaxGroup withTaxRate(Double taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     * The net amount for this group
     * (Required)
     * 
     */
    @JsonProperty("netAmount")
    public Double getNetAmount() {
        return netAmount;
    }

    /**
     * The net amount for this group
     * (Required)
     * 
     */
    @JsonProperty("netAmount")
    public void setNetAmount(Double netAmount) {
        this.netAmount = netAmount;
    }

    public TaxGroup withNetAmount(Double netAmount) {
        this.netAmount = netAmount;
        return this;
    }

    /**
     * The tax amount for this group
     * (Required)
     * 
     */
    @JsonProperty("taxAmount")
    public Double getTaxAmount() {
        return taxAmount;
    }

    /**
     * The tax amount for this group
     * (Required)
     * 
     */
    @JsonProperty("taxAmount")
    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public TaxGroup withTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }

    /**
     * The net amount for this group in base currency. Will be calculated only for documents in foreign currency.
     * 
     */
    @JsonProperty("baseCurrencyNetAmount")
    public Double getBaseCurrencyNetAmount() {
        return baseCurrencyNetAmount;
    }

    /**
     * The net amount for this group in base currency. Will be calculated only for documents in foreign currency.
     * 
     */
    @JsonProperty("baseCurrencyNetAmount")
    public void setBaseCurrencyNetAmount(Double baseCurrencyNetAmount) {
        this.baseCurrencyNetAmount = baseCurrencyNetAmount;
    }

    public TaxGroup withBaseCurrencyNetAmount(Double baseCurrencyNetAmount) {
        this.baseCurrencyNetAmount = baseCurrencyNetAmount;
        return this;
    }

    /**
     * The net deduction amount for this group in base currency. Will be calculated only for documents in foreign currency.
     * 
     */
    @JsonProperty("baseCurrencyTaxAmount")
    public Double getBaseCurrencyTaxAmount() {
        return baseCurrencyTaxAmount;
    }

    /**
     * The net deduction amount for this group in base currency. Will be calculated only for documents in foreign currency.
     * 
     */
    @JsonProperty("baseCurrencyTaxAmount")
    public void setBaseCurrencyTaxAmount(Double baseCurrencyTaxAmount) {
        this.baseCurrencyTaxAmount = baseCurrencyTaxAmount;
    }

    public TaxGroup withBaseCurrencyTaxAmount(Double baseCurrencyTaxAmount) {
        this.baseCurrencyTaxAmount = baseCurrencyTaxAmount;
        return this;
    }

}
