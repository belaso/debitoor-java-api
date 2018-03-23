
package de.ctsc.debitoor.java.api.v4;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Expense
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "date",
    "fileId",
    "supplierId",
    "supplierName",
    "supplierCountry",
    "supplierCiNumber",
    "payments",
    "createdFromEmail",
    "attachmentOverQuota",
    "totalGrossAmount",
    "totalNetAmount",
    "totalTaxAmount",
    "unpaidAmount",
    "currency",
    "number",
    "taxGroups",
    "file",
    "lines",
    "incomeTaxDeductionAmount",
    "links",
    "generated",
    "createdDate",
    "lastModifiedDate",
    "deletedDate"
})
public class Expense {

    /**
     * id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("id")
    private String id;
    /**
     * The expense date
     * (Required)
     * 
     */
    @JsonProperty("date")
    @JsonPropertyDescription("The expense date")
    private String date;
    /**
     * Id of the file attachment for this expense. Must be a file id
     * 
     */
    @JsonProperty("fileId")
    @JsonPropertyDescription("Id of the file attachment for this expense. Must be a file id")
    private String fileId;
    /**
     * Id of the supplier for this expense. Must be a valid supplier id
     * 
     */
    @JsonProperty("supplierId")
    @JsonPropertyDescription("Id of the supplier for this expense. Must be a valid supplier id")
    private String supplierId;
    /**
     * Name of supplier on expense
     * 
     */
    @JsonProperty("supplierName")
    @JsonPropertyDescription("Name of supplier on expense")
    private String supplierName;
    /**
     * Country code supplier. Must be valid country code
     * 
     */
    @JsonProperty("supplierCountry")
    @JsonPropertyDescription("Country code supplier. Must be valid country code")
    private String supplierCountry;
    /**
     * VAT/Company number of supplier on expense
     * 
     */
    @JsonProperty("supplierCiNumber")
    @JsonPropertyDescription("VAT/Company number of supplier on expense")
    private String supplierCiNumber;
    @JsonProperty("payments")
    private List<Payment> payments = null;
    /**
     * true if expense was created from email
     * 
     */
    @JsonProperty("createdFromEmail")
    @JsonPropertyDescription("true if expense was created from email")
    private Boolean createdFromEmail;
    /**
     * true if expense attachment was created when there where not expense attachments left in quota
     * 
     */
    @JsonProperty("attachmentOverQuota")
    @JsonPropertyDescription("true if expense attachment was created when there where not expense attachments left in quota")
    private Boolean attachmentOverQuota;
    /**
     * Summary total gross amount for all lines, calculates on server
     * 
     */
    @JsonProperty("totalGrossAmount")
    @JsonPropertyDescription("Summary total gross amount for all lines, calculates on server")
    private Double totalGrossAmount;
    /**
     * Total net amount for expense
     * 
     */
    @JsonProperty("totalNetAmount")
    @JsonPropertyDescription("Total net amount for expense")
    private Double totalNetAmount;
    /**
     * Total tax amount for expense. This will be re-calculated when posted to the server
     * 
     */
    @JsonProperty("totalTaxAmount")
    @JsonPropertyDescription("Total tax amount for expense. This will be re-calculated when posted to the server")
    private Double totalTaxAmount;
    /**
     * Unpaid amount for expense. This will be re-calculated when posted to the server
     * 
     */
    @JsonProperty("unpaidAmount")
    @JsonPropertyDescription("Unpaid amount for expense. This will be re-calculated when posted to the server")
    private Double unpaidAmount;
    /**
     * Defines expense currency, is always set to you account-currency
     * 
     */
    @JsonProperty("currency")
    @JsonPropertyDescription("Defines expense currency, is always set to you account-currency")
    private String currency;
    /**
     * Defines the number of the expense. Can be set automatically during POST if ?autonumber=true is specified in query. Otherwise it's required. On accounts running with strict accounting mode, autonumber=true will be ignored on POST and no number can be set during POST and PUT. To assign a number to an expense in strict accounting mode you must use the booking endpoint afterwards.
     * 
     */
    @JsonProperty("number")
    @JsonPropertyDescription("Defines the number of the expense. Can be set automatically during POST if ?autonumber=true is specified in query. Otherwise it's required. On accounts running with strict accounting mode, autonumber=true will be ignored on POST and no number can be set during POST and PUT. To assign a number to an expense in strict accounting mode you must use the booking endpoint afterwards.")
    private Integer number;
    /**
     * Tax groups
     * 
     */
    @JsonProperty("taxGroups")
    @JsonPropertyDescription("Tax groups")
    private List<TaxGroup> taxGroups = null;
    /**
     * A file attachment. For expenses these properties will be set if you save the expense with an fileId
     * 
     */
    @JsonProperty("file")
    @JsonPropertyDescription("A file attachment. For expenses these properties will be set if you save the expense with an fileId")
    private File file;
    /**
     * Expenses lines
     * (Required)
     * 
     */
    @JsonProperty("lines")
    @JsonPropertyDescription("Expenses lines")
    private List<Line> lines = null;
    /**
     * The total income tax deduction for all the lines on the expense. You can only submit a value here if you are in ES, IT, IC, CO or GB
     * 
     */
    @JsonProperty("incomeTaxDeductionAmount")
    @JsonPropertyDescription("The total income tax deduction for all the lines on the expense. You can only submit a value here if you are in ES, IT, IC, CO or GB")
    private Double incomeTaxDeductionAmount;
    /**
     * Link to invoice
     * 
     */
    @JsonProperty("links")
    @JsonPropertyDescription("Link to invoice")
    private List<Link> links = null;
    /**
     * Additional information if this expense was automatically generated
     * 
     */
    @JsonProperty("generated")
    @JsonPropertyDescription("Additional information if this expense was automatically generated")
    private Generated generated;
    /**
     * Timestamp of creation of this document
     * 
     */
    @JsonProperty("createdDate")
    @JsonPropertyDescription("Timestamp of creation of this document")
    private String createdDate;
    /**
     * Timestamp of last modification of this document
     * 
     */
    @JsonProperty("lastModifiedDate")
    @JsonPropertyDescription("Timestamp of last modification of this document")
    private String lastModifiedDate;
    /**
     * Timestamp of deletion of this document. Deleted documents are only included on lists, if you specify the querystring ?includeDeleted=true in your GET
     * 
     */
    @JsonProperty("deletedDate")
    @JsonPropertyDescription("Timestamp of deletion of this document. Deleted documents are only included on lists, if you specify the querystring ?includeDeleted=true in your GET")
    private String deletedDate;

    /**
     * id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Expense withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The expense date
     * (Required)
     * 
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * The expense date
     * (Required)
     * 
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    public Expense withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Id of the file attachment for this expense. Must be a file id
     * 
     */
    @JsonProperty("fileId")
    public String getFileId() {
        return fileId;
    }

    /**
     * Id of the file attachment for this expense. Must be a file id
     * 
     */
    @JsonProperty("fileId")
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public Expense withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * Id of the supplier for this expense. Must be a valid supplier id
     * 
     */
    @JsonProperty("supplierId")
    public String getSupplierId() {
        return supplierId;
    }

    /**
     * Id of the supplier for this expense. Must be a valid supplier id
     * 
     */
    @JsonProperty("supplierId")
    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public Expense withSupplierId(String supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    /**
     * Name of supplier on expense
     * 
     */
    @JsonProperty("supplierName")
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * Name of supplier on expense
     * 
     */
    @JsonProperty("supplierName")
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Expense withSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }

    /**
     * Country code supplier. Must be valid country code
     * 
     */
    @JsonProperty("supplierCountry")
    public String getSupplierCountry() {
        return supplierCountry;
    }

    /**
     * Country code supplier. Must be valid country code
     * 
     */
    @JsonProperty("supplierCountry")
    public void setSupplierCountry(String supplierCountry) {
        this.supplierCountry = supplierCountry;
    }

    public Expense withSupplierCountry(String supplierCountry) {
        this.supplierCountry = supplierCountry;
        return this;
    }

    /**
     * VAT/Company number of supplier on expense
     * 
     */
    @JsonProperty("supplierCiNumber")
    public String getSupplierCiNumber() {
        return supplierCiNumber;
    }

    /**
     * VAT/Company number of supplier on expense
     * 
     */
    @JsonProperty("supplierCiNumber")
    public void setSupplierCiNumber(String supplierCiNumber) {
        this.supplierCiNumber = supplierCiNumber;
    }

    public Expense withSupplierCiNumber(String supplierCiNumber) {
        this.supplierCiNumber = supplierCiNumber;
        return this;
    }

    @JsonProperty("payments")
    public List<Payment> getPayments() {
        return payments;
    }

    @JsonProperty("payments")
    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public Expense withPayments(List<Payment> payments) {
        this.payments = payments;
        return this;
    }

    /**
     * true if expense was created from email
     * 
     */
    @JsonProperty("createdFromEmail")
    public Boolean getCreatedFromEmail() {
        return createdFromEmail;
    }

    /**
     * true if expense was created from email
     * 
     */
    @JsonProperty("createdFromEmail")
    public void setCreatedFromEmail(Boolean createdFromEmail) {
        this.createdFromEmail = createdFromEmail;
    }

    public Expense withCreatedFromEmail(Boolean createdFromEmail) {
        this.createdFromEmail = createdFromEmail;
        return this;
    }

    /**
     * true if expense attachment was created when there where not expense attachments left in quota
     * 
     */
    @JsonProperty("attachmentOverQuota")
    public Boolean getAttachmentOverQuota() {
        return attachmentOverQuota;
    }

    /**
     * true if expense attachment was created when there where not expense attachments left in quota
     * 
     */
    @JsonProperty("attachmentOverQuota")
    public void setAttachmentOverQuota(Boolean attachmentOverQuota) {
        this.attachmentOverQuota = attachmentOverQuota;
    }

    public Expense withAttachmentOverQuota(Boolean attachmentOverQuota) {
        this.attachmentOverQuota = attachmentOverQuota;
        return this;
    }

    /**
     * Summary total gross amount for all lines, calculates on server
     * 
     */
    @JsonProperty("totalGrossAmount")
    public Double getTotalGrossAmount() {
        return totalGrossAmount;
    }

    /**
     * Summary total gross amount for all lines, calculates on server
     * 
     */
    @JsonProperty("totalGrossAmount")
    public void setTotalGrossAmount(Double totalGrossAmount) {
        this.totalGrossAmount = totalGrossAmount;
    }

    public Expense withTotalGrossAmount(Double totalGrossAmount) {
        this.totalGrossAmount = totalGrossAmount;
        return this;
    }

    /**
     * Total net amount for expense
     * 
     */
    @JsonProperty("totalNetAmount")
    public Double getTotalNetAmount() {
        return totalNetAmount;
    }

    /**
     * Total net amount for expense
     * 
     */
    @JsonProperty("totalNetAmount")
    public void setTotalNetAmount(Double totalNetAmount) {
        this.totalNetAmount = totalNetAmount;
    }

    public Expense withTotalNetAmount(Double totalNetAmount) {
        this.totalNetAmount = totalNetAmount;
        return this;
    }

    /**
     * Total tax amount for expense. This will be re-calculated when posted to the server
     * 
     */
    @JsonProperty("totalTaxAmount")
    public Double getTotalTaxAmount() {
        return totalTaxAmount;
    }

    /**
     * Total tax amount for expense. This will be re-calculated when posted to the server
     * 
     */
    @JsonProperty("totalTaxAmount")
    public void setTotalTaxAmount(Double totalTaxAmount) {
        this.totalTaxAmount = totalTaxAmount;
    }

    public Expense withTotalTaxAmount(Double totalTaxAmount) {
        this.totalTaxAmount = totalTaxAmount;
        return this;
    }

    /**
     * Unpaid amount for expense. This will be re-calculated when posted to the server
     * 
     */
    @JsonProperty("unpaidAmount")
    public Double getUnpaidAmount() {
        return unpaidAmount;
    }

    /**
     * Unpaid amount for expense. This will be re-calculated when posted to the server
     * 
     */
    @JsonProperty("unpaidAmount")
    public void setUnpaidAmount(Double unpaidAmount) {
        this.unpaidAmount = unpaidAmount;
    }

    public Expense withUnpaidAmount(Double unpaidAmount) {
        this.unpaidAmount = unpaidAmount;
        return this;
    }

    /**
     * Defines expense currency, is always set to you account-currency
     * 
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * Defines expense currency, is always set to you account-currency
     * 
     */
    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Expense withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Defines the number of the expense. Can be set automatically during POST if ?autonumber=true is specified in query. Otherwise it's required. On accounts running with strict accounting mode, autonumber=true will be ignored on POST and no number can be set during POST and PUT. To assign a number to an expense in strict accounting mode you must use the booking endpoint afterwards.
     * 
     */
    @JsonProperty("number")
    public Integer getNumber() {
        return number;
    }

    /**
     * Defines the number of the expense. Can be set automatically during POST if ?autonumber=true is specified in query. Otherwise it's required. On accounts running with strict accounting mode, autonumber=true will be ignored on POST and no number can be set during POST and PUT. To assign a number to an expense in strict accounting mode you must use the booking endpoint afterwards.
     * 
     */
    @JsonProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    public Expense withNumber(Integer number) {
        this.number = number;
        return this;
    }

    /**
     * Tax groups
     * 
     */
    @JsonProperty("taxGroups")
    public List<TaxGroup> getTaxGroups() {
        return taxGroups;
    }

    /**
     * Tax groups
     * 
     */
    @JsonProperty("taxGroups")
    public void setTaxGroups(List<TaxGroup> taxGroups) {
        this.taxGroups = taxGroups;
    }

    public Expense withTaxGroups(List<TaxGroup> taxGroups) {
        this.taxGroups = taxGroups;
        return this;
    }

    /**
     * A file attachment. For expenses these properties will be set if you save the expense with an fileId
     * 
     */
    @JsonProperty("file")
    public File getFile() {
        return file;
    }

    /**
     * A file attachment. For expenses these properties will be set if you save the expense with an fileId
     * 
     */
    @JsonProperty("file")
    public void setFile(File file) {
        this.file = file;
    }

    public Expense withFile(File file) {
        this.file = file;
        return this;
    }

    /**
     * Expenses lines
     * (Required)
     * 
     */
    @JsonProperty("lines")
    public List<Line> getLines() {
        return lines;
    }

    /**
     * Expenses lines
     * (Required)
     * 
     */
    @JsonProperty("lines")
    public void setLines(List<Line> lines) {
        this.lines = lines;
    }

    public Expense withLines(List<Line> lines) {
        this.lines = lines;
        return this;
    }

    /**
     * The total income tax deduction for all the lines on the expense. You can only submit a value here if you are in ES, IT, IC, CO or GB
     * 
     */
    @JsonProperty("incomeTaxDeductionAmount")
    public Double getIncomeTaxDeductionAmount() {
        return incomeTaxDeductionAmount;
    }

    /**
     * The total income tax deduction for all the lines on the expense. You can only submit a value here if you are in ES, IT, IC, CO or GB
     * 
     */
    @JsonProperty("incomeTaxDeductionAmount")
    public void setIncomeTaxDeductionAmount(Double incomeTaxDeductionAmount) {
        this.incomeTaxDeductionAmount = incomeTaxDeductionAmount;
    }

    public Expense withIncomeTaxDeductionAmount(Double incomeTaxDeductionAmount) {
        this.incomeTaxDeductionAmount = incomeTaxDeductionAmount;
        return this;
    }

    /**
     * Link to invoice
     * 
     */
    @JsonProperty("links")
    public List<Link> getLinks() {
        return links;
    }

    /**
     * Link to invoice
     * 
     */
    @JsonProperty("links")
    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public Expense withLinks(List<Link> links) {
        this.links = links;
        return this;
    }

    /**
     * Additional information if this expense was automatically generated
     * 
     */
    @JsonProperty("generated")
    public Generated getGenerated() {
        return generated;
    }

    /**
     * Additional information if this expense was automatically generated
     * 
     */
    @JsonProperty("generated")
    public void setGenerated(Generated generated) {
        this.generated = generated;
    }

    public Expense withGenerated(Generated generated) {
        this.generated = generated;
        return this;
    }

    /**
     * Timestamp of creation of this document
     * 
     */
    @JsonProperty("createdDate")
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * Timestamp of creation of this document
     * 
     */
    @JsonProperty("createdDate")
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Expense withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * Timestamp of last modification of this document
     * 
     */
    @JsonProperty("lastModifiedDate")
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Timestamp of last modification of this document
     * 
     */
    @JsonProperty("lastModifiedDate")
    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Expense withLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * Timestamp of deletion of this document. Deleted documents are only included on lists, if you specify the querystring ?includeDeleted=true in your GET
     * 
     */
    @JsonProperty("deletedDate")
    public String getDeletedDate() {
        return deletedDate;
    }

    /**
     * Timestamp of deletion of this document. Deleted documents are only included on lists, if you specify the querystring ?includeDeleted=true in your GET
     * 
     */
    @JsonProperty("deletedDate")
    public void setDeletedDate(String deletedDate) {
        this.deletedDate = deletedDate;
    }

    public Expense withDeletedDate(String deletedDate) {
        this.deletedDate = deletedDate;
        return this;
    }

}
