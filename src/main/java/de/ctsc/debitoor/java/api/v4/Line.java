
package de.ctsc.debitoor.java.api.v4;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * One expense(income) line
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description",
    "categoryId",
    "categoryType",
    "grossAmount",
    "netAmount",
    "taxAmount",
    "taxRate",
    "priceDisplayType",
    "incomeTaxDeductionAmount",
    "assetLifetime",
    "assetSalvageValue",
    "assetDepreciation",
    "reverseCharge"
})
public class Line {

    /**
     * The description of my expense(income) line
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of my expense(income) line")
    private String description;
    /**
     * Id, of the category of an expense(income). Must be a valid id of an existing category
     * 
     */
    @JsonProperty("categoryId")
    @JsonPropertyDescription("Id, of the category of an expense(income). Must be a valid id of an existing category")
    private String categoryId;
    /**
     * Type of category. Must be a valid type belonging to the selected category.
     * 
     */
    @JsonProperty("categoryType")
    @JsonPropertyDescription("Type of category. Must be a valid type belonging to the selected category.")
    private String categoryType;
    /**
     * The gross amount for this expense(income) line. This will be re-calculated when posted to the server in case of priceDisplayType is "net" or not specified. Required in case of priceDisplayType on line is "gross"
     * 
     */
    @JsonProperty("grossAmount")
    @JsonPropertyDescription("The gross amount for this expense(income) line. This will be re-calculated when posted to the server in case of priceDisplayType is \"net\" or not specified. Required in case of priceDisplayType on line is \"gross\"")
    private Double grossAmount;
    /**
     * The net amount for this expense(income) line. This will be re-calculated when posted to the server in case of priceDisplayType is "gross" or not specified. Required in case of priceDisplayType on line is "net"
     * 
     */
    @JsonProperty("netAmount")
    @JsonPropertyDescription("The net amount for this expense(income) line. This will be re-calculated when posted to the server in case of priceDisplayType is \"gross\" or not specified. Required in case of priceDisplayType on line is \"net\"")
    private Double netAmount;
    /**
     * Tax amount for this expense(income) line. This will be re-calculated when posted to the server
     * 
     */
    @JsonProperty("taxAmount")
    @JsonPropertyDescription("Tax amount for this expense(income) line. This will be re-calculated when posted to the server")
    private Double taxAmount;
    /**
     * Vat rate in percent
     * (Required)
     * 
     */
    @JsonProperty("taxRate")
    @JsonPropertyDescription("Vat rate in percent")
    private Double taxRate;
    /**
     * Shows the default price type on line that will be displayed on the debitoor website. Default is "gross"
     * 
     */
    @JsonProperty("priceDisplayType")
    @JsonPropertyDescription("Shows the default price type on line that will be displayed on the debitoor website. Default is \"gross\"")
    private String priceDisplayType;
    /**
     * The part of income tax deduction that applies to this expense(income) line. This will be re-calculated when posted to the server in case incomeTaxDeductionAmount is specified for whole expense(income). Only present if you are in ES, IT, IC, CO or GB
     * 
     */
    @JsonProperty("incomeTaxDeductionAmount")
    @JsonPropertyDescription("The part of income tax deduction that applies to this expense(income) line. This will be re-calculated when posted to the server in case incomeTaxDeductionAmount is specified for whole expense(income). Only present if you are in ES, IT, IC, CO or GB")
    private Double incomeTaxDeductionAmount;
    /**
     * The expected lifetime value of an asset. If this property is set, assetSalvageValue and assetDepreciation is required.
     * 
     */
    @JsonProperty("assetLifetime")
    @JsonPropertyDescription("The expected lifetime value of an asset. If this property is set, assetSalvageValue and assetDepreciation is required.")
    private Integer assetLifetime;
    /**
     * The salvage value of an asset. If this property is set, assetLifetime and assetDepreciation is required.
     * 
     */
    @JsonProperty("assetSalvageValue")
    @JsonPropertyDescription("The salvage value of an asset. If this property is set, assetLifetime and assetDepreciation is required.")
    private Double assetSalvageValue;
    @JsonProperty("assetDepreciation")
    private List<AssetDepreciation> assetDepreciation = null;
    /**
     * Reverse charge details for non domestic purchase from one EU country to another (intraEu purchase)
     * 
     */
    @JsonProperty("reverseCharge")
    @JsonPropertyDescription("Reverse charge details for non domestic purchase from one EU country to another (intraEu purchase)")
    private ReverseCharge reverseCharge;

    /**
     * The description of my expense(income) line
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * The description of my expense(income) line
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Line withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Id, of the category of an expense(income). Must be a valid id of an existing category
     * 
     */
    @JsonProperty("categoryId")
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * Id, of the category of an expense(income). Must be a valid id of an existing category
     * 
     */
    @JsonProperty("categoryId")
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Line withCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * Type of category. Must be a valid type belonging to the selected category.
     * 
     */
    @JsonProperty("categoryType")
    public String getCategoryType() {
        return categoryType;
    }

    /**
     * Type of category. Must be a valid type belonging to the selected category.
     * 
     */
    @JsonProperty("categoryType")
    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public Line withCategoryType(String categoryType) {
        this.categoryType = categoryType;
        return this;
    }

    /**
     * The gross amount for this expense(income) line. This will be re-calculated when posted to the server in case of priceDisplayType is "net" or not specified. Required in case of priceDisplayType on line is "gross"
     * 
     */
    @JsonProperty("grossAmount")
    public Double getGrossAmount() {
        return grossAmount;
    }

    /**
     * The gross amount for this expense(income) line. This will be re-calculated when posted to the server in case of priceDisplayType is "net" or not specified. Required in case of priceDisplayType on line is "gross"
     * 
     */
    @JsonProperty("grossAmount")
    public void setGrossAmount(Double grossAmount) {
        this.grossAmount = grossAmount;
    }

    public Line withGrossAmount(Double grossAmount) {
        this.grossAmount = grossAmount;
        return this;
    }

    /**
     * The net amount for this expense(income) line. This will be re-calculated when posted to the server in case of priceDisplayType is "gross" or not specified. Required in case of priceDisplayType on line is "net"
     * 
     */
    @JsonProperty("netAmount")
    public Double getNetAmount() {
        return netAmount;
    }

    /**
     * The net amount for this expense(income) line. This will be re-calculated when posted to the server in case of priceDisplayType is "gross" or not specified. Required in case of priceDisplayType on line is "net"
     * 
     */
    @JsonProperty("netAmount")
    public void setNetAmount(Double netAmount) {
        this.netAmount = netAmount;
    }

    public Line withNetAmount(Double netAmount) {
        this.netAmount = netAmount;
        return this;
    }

    /**
     * Tax amount for this expense(income) line. This will be re-calculated when posted to the server
     * 
     */
    @JsonProperty("taxAmount")
    public Double getTaxAmount() {
        return taxAmount;
    }

    /**
     * Tax amount for this expense(income) line. This will be re-calculated when posted to the server
     * 
     */
    @JsonProperty("taxAmount")
    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Line withTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }

    /**
     * Vat rate in percent
     * (Required)
     * 
     */
    @JsonProperty("taxRate")
    public Double getTaxRate() {
        return taxRate;
    }

    /**
     * Vat rate in percent
     * (Required)
     * 
     */
    @JsonProperty("taxRate")
    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public Line withTaxRate(Double taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     * Shows the default price type on line that will be displayed on the debitoor website. Default is "gross"
     * 
     */
    @JsonProperty("priceDisplayType")
    public String getPriceDisplayType() {
        return priceDisplayType;
    }

    /**
     * Shows the default price type on line that will be displayed on the debitoor website. Default is "gross"
     * 
     */
    @JsonProperty("priceDisplayType")
    public void setPriceDisplayType(String priceDisplayType) {
        this.priceDisplayType = priceDisplayType;
    }

    public Line withPriceDisplayType(String priceDisplayType) {
        this.priceDisplayType = priceDisplayType;
        return this;
    }

    /**
     * The part of income tax deduction that applies to this expense(income) line. This will be re-calculated when posted to the server in case incomeTaxDeductionAmount is specified for whole expense(income). Only present if you are in ES, IT, IC, CO or GB
     * 
     */
    @JsonProperty("incomeTaxDeductionAmount")
    public Double getIncomeTaxDeductionAmount() {
        return incomeTaxDeductionAmount;
    }

    /**
     * The part of income tax deduction that applies to this expense(income) line. This will be re-calculated when posted to the server in case incomeTaxDeductionAmount is specified for whole expense(income). Only present if you are in ES, IT, IC, CO or GB
     * 
     */
    @JsonProperty("incomeTaxDeductionAmount")
    public void setIncomeTaxDeductionAmount(Double incomeTaxDeductionAmount) {
        this.incomeTaxDeductionAmount = incomeTaxDeductionAmount;
    }

    public Line withIncomeTaxDeductionAmount(Double incomeTaxDeductionAmount) {
        this.incomeTaxDeductionAmount = incomeTaxDeductionAmount;
        return this;
    }

    /**
     * The expected lifetime value of an asset. If this property is set, assetSalvageValue and assetDepreciation is required.
     * 
     */
    @JsonProperty("assetLifetime")
    public Integer getAssetLifetime() {
        return assetLifetime;
    }

    /**
     * The expected lifetime value of an asset. If this property is set, assetSalvageValue and assetDepreciation is required.
     * 
     */
    @JsonProperty("assetLifetime")
    public void setAssetLifetime(Integer assetLifetime) {
        this.assetLifetime = assetLifetime;
    }

    public Line withAssetLifetime(Integer assetLifetime) {
        this.assetLifetime = assetLifetime;
        return this;
    }

    /**
     * The salvage value of an asset. If this property is set, assetLifetime and assetDepreciation is required.
     * 
     */
    @JsonProperty("assetSalvageValue")
    public Double getAssetSalvageValue() {
        return assetSalvageValue;
    }

    /**
     * The salvage value of an asset. If this property is set, assetLifetime and assetDepreciation is required.
     * 
     */
    @JsonProperty("assetSalvageValue")
    public void setAssetSalvageValue(Double assetSalvageValue) {
        this.assetSalvageValue = assetSalvageValue;
    }

    public Line withAssetSalvageValue(Double assetSalvageValue) {
        this.assetSalvageValue = assetSalvageValue;
        return this;
    }

    @JsonProperty("assetDepreciation")
    public List<AssetDepreciation> getAssetDepreciation() {
        return assetDepreciation;
    }

    @JsonProperty("assetDepreciation")
    public void setAssetDepreciation(List<AssetDepreciation> assetDepreciation) {
        this.assetDepreciation = assetDepreciation;
    }

    public Line withAssetDepreciation(List<AssetDepreciation> assetDepreciation) {
        this.assetDepreciation = assetDepreciation;
        return this;
    }

    /**
     * Reverse charge details for non domestic purchase from one EU country to another (intraEu purchase)
     * 
     */
    @JsonProperty("reverseCharge")
    public ReverseCharge getReverseCharge() {
        return reverseCharge;
    }

    /**
     * Reverse charge details for non domestic purchase from one EU country to another (intraEu purchase)
     * 
     */
    @JsonProperty("reverseCharge")
    public void setReverseCharge(ReverseCharge reverseCharge) {
        this.reverseCharge = reverseCharge;
    }

    public Line withReverseCharge(ReverseCharge reverseCharge) {
        this.reverseCharge = reverseCharge;
        return this;
    }

}
