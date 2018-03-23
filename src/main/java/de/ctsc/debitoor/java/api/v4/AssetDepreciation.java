
package de.ctsc.debitoor.java.api.v4;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Yearly depreciation entry
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "depreciationDate",
    "depreciationCost",
    "bookValue",
    "accumulatedDepreciation"
})
public class AssetDepreciation {

    /**
     * The yearly date of the expense cost
     * 
     */
    @JsonProperty("depreciationDate")
    @JsonPropertyDescription("The yearly date of the expense cost")
    private String depreciationDate;
    /**
     * The yearly expense cost
     * (Required)
     * 
     */
    @JsonProperty("depreciationCost")
    @JsonPropertyDescription("The yearly expense cost")
    private Double depreciationCost;
    /**
     * The yearly book value
     * 
     */
    @JsonProperty("bookValue")
    @JsonPropertyDescription("The yearly book value")
    private Double bookValue;
    /**
     * The yearly accumulated cost amount
     * 
     */
    @JsonProperty("accumulatedDepreciation")
    @JsonPropertyDescription("The yearly accumulated cost amount")
    private Double accumulatedDepreciation;

    /**
     * The yearly date of the expense cost
     * 
     */
    @JsonProperty("depreciationDate")
    public String getDepreciationDate() {
        return depreciationDate;
    }

    /**
     * The yearly date of the expense cost
     * 
     */
    @JsonProperty("depreciationDate")
    public void setDepreciationDate(String depreciationDate) {
        this.depreciationDate = depreciationDate;
    }

    public AssetDepreciation withDepreciationDate(String depreciationDate) {
        this.depreciationDate = depreciationDate;
        return this;
    }

    /**
     * The yearly expense cost
     * (Required)
     * 
     */
    @JsonProperty("depreciationCost")
    public Double getDepreciationCost() {
        return depreciationCost;
    }

    /**
     * The yearly expense cost
     * (Required)
     * 
     */
    @JsonProperty("depreciationCost")
    public void setDepreciationCost(Double depreciationCost) {
        this.depreciationCost = depreciationCost;
    }

    public AssetDepreciation withDepreciationCost(Double depreciationCost) {
        this.depreciationCost = depreciationCost;
        return this;
    }

    /**
     * The yearly book value
     * 
     */
    @JsonProperty("bookValue")
    public Double getBookValue() {
        return bookValue;
    }

    /**
     * The yearly book value
     * 
     */
    @JsonProperty("bookValue")
    public void setBookValue(Double bookValue) {
        this.bookValue = bookValue;
    }

    public AssetDepreciation withBookValue(Double bookValue) {
        this.bookValue = bookValue;
        return this;
    }

    /**
     * The yearly accumulated cost amount
     * 
     */
    @JsonProperty("accumulatedDepreciation")
    public Double getAccumulatedDepreciation() {
        return accumulatedDepreciation;
    }

    /**
     * The yearly accumulated cost amount
     * 
     */
    @JsonProperty("accumulatedDepreciation")
    public void setAccumulatedDepreciation(Double accumulatedDepreciation) {
        this.accumulatedDepreciation = accumulatedDepreciation;
    }

    public AssetDepreciation withAccumulatedDepreciation(Double accumulatedDepreciation) {
        this.accumulatedDepreciation = accumulatedDepreciation;
        return this;
    }

}
