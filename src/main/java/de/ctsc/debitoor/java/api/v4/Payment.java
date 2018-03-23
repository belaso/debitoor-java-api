
package de.ctsc.debitoor.java.api.v4;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Payment
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "expenseId",
    "invoiceId",
    "creditNoteId",
    "incomeId",
    "paymentTransactionId",
    "paymentAccountId",
    "matchedPaymentAccountId",
    "matchedPaymentTransactionId",
    "integrationType",
    "paymentType",
    "createdDate",
    "amount",
    "invoiceNumber",
    "creditNoteNumber",
    "categoryIds",
    "paymentDate",
    "text",
    "currency",
    "customerName",
    "supplierName",
    "description"
})
public class Payment {

    /**
     * id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("id")
    private String id;
    /**
     * Matched expense id. Required in case of matching to expense
     * 
     */
    @JsonProperty("expenseId")
    @JsonPropertyDescription("Matched expense id. Required in case of matching to expense")
    private String expenseId;
    /**
     * Matched invoice id. Required in case of matching to invoice
     * 
     */
    @JsonProperty("invoiceId")
    @JsonPropertyDescription("Matched invoice id. Required in case of matching to invoice")
    private String invoiceId;
    /**
     * Matched credit note id. Required in case of matching to credit note
     * 
     */
    @JsonProperty("creditNoteId")
    @JsonPropertyDescription("Matched credit note id. Required in case of matching to credit note")
    private String creditNoteId;
    /**
     * Matched income id. Required in case of matching to income
     * 
     */
    @JsonProperty("incomeId")
    @JsonPropertyDescription("Matched income id. Required in case of matching to income")
    private String incomeId;
    /**
     * Matched bank/cash transaction id. Required in case of matching to existing bank/cash transaction
     * 
     */
    @JsonProperty("paymentTransactionId")
    @JsonPropertyDescription("Matched bank/cash transaction id. Required in case of matching to existing bank/cash transaction")
    private String paymentTransactionId;
    /**
     * Id of account, on which payment is done
     * (Required)
     * 
     */
    @JsonProperty("paymentAccountId")
    @JsonPropertyDescription("Id of account, on which payment is done")
    private String paymentAccountId;
    /**
     * When transferring between accounts, id of account matched to this payment
     * 
     */
    @JsonProperty("matchedPaymentAccountId")
    @JsonPropertyDescription("When transferring between accounts, id of account matched to this payment")
    private String matchedPaymentAccountId;
    /**
     * When transferring between accounts, id of bank/cash transaction matched to this payment
     * 
     */
    @JsonProperty("matchedPaymentTransactionId")
    @JsonPropertyDescription("When transferring between accounts, id of bank/cash transaction matched to this payment")
    private String matchedPaymentTransactionId;
    /**
     * Account integration type
     * 
     */
    @JsonProperty("integrationType")
    @JsonPropertyDescription("Account integration type")
    private Payment.IntegrationType integrationType;
    /**
     * Account money origination
     * 
     */
    @JsonProperty("paymentType")
    @JsonPropertyDescription("Account money origination")
    private Payment.PaymentType paymentType;
    /**
     * Date and time when payment was created
     * 
     */
    @JsonProperty("createdDate")
    @JsonPropertyDescription("Date and time when payment was created")
    private Date createdDate;
    /**
     * Amount of payment
     * (Required)
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("Amount of payment")
    private Double amount;
    /**
     * Invoice number
     * 
     */
    @JsonProperty("invoiceNumber")
    @JsonPropertyDescription("Invoice number")
    private String invoiceNumber;
    /**
     * Credit note number
     * 
     */
    @JsonProperty("creditNoteNumber")
    @JsonPropertyDescription("Credit note number")
    private String creditNoteNumber;
    /**
     * List of Expense/Income category ids
     * 
     */
    @JsonProperty("categoryIds")
    @JsonPropertyDescription("List of Expense/Income category ids")
    private List<String> categoryIds = null;
    /**
     * Date of payment. Required in case of matching with transaction of manual cash/bank account
     * 
     */
    @JsonProperty("paymentDate")
    @JsonPropertyDescription("Date of payment. Required in case of matching with transaction of manual cash/bank account")
    private String paymentDate;
    /**
     * Text of payment
     * 
     */
    @JsonProperty("text")
    @JsonPropertyDescription("Text of payment")
    private String text;
    /**
     * Defines payment currency
     * (Required)
     * 
     */
    @JsonProperty("currency")
    @JsonPropertyDescription("Defines payment currency")
    private String currency;
    /**
     * Customer name
     * 
     */
    @JsonProperty("customerName")
    @JsonPropertyDescription("Customer name")
    private String customerName;
    /**
     * Supplier name
     * 
     */
    @JsonProperty("supplierName")
    @JsonPropertyDescription("Supplier name")
    private String supplierName;
    /**
     * Transaction description, may contain customer or supplier name, bank info
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Transaction description, may contain customer or supplier name, bank info")
    private String description;

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

    public Payment withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Matched expense id. Required in case of matching to expense
     * 
     */
    @JsonProperty("expenseId")
    public String getExpenseId() {
        return expenseId;
    }

    /**
     * Matched expense id. Required in case of matching to expense
     * 
     */
    @JsonProperty("expenseId")
    public void setExpenseId(String expenseId) {
        this.expenseId = expenseId;
    }

    public Payment withExpenseId(String expenseId) {
        this.expenseId = expenseId;
        return this;
    }

    /**
     * Matched invoice id. Required in case of matching to invoice
     * 
     */
    @JsonProperty("invoiceId")
    public String getInvoiceId() {
        return invoiceId;
    }

    /**
     * Matched invoice id. Required in case of matching to invoice
     * 
     */
    @JsonProperty("invoiceId")
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Payment withInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
        return this;
    }

    /**
     * Matched credit note id. Required in case of matching to credit note
     * 
     */
    @JsonProperty("creditNoteId")
    public String getCreditNoteId() {
        return creditNoteId;
    }

    /**
     * Matched credit note id. Required in case of matching to credit note
     * 
     */
    @JsonProperty("creditNoteId")
    public void setCreditNoteId(String creditNoteId) {
        this.creditNoteId = creditNoteId;
    }

    public Payment withCreditNoteId(String creditNoteId) {
        this.creditNoteId = creditNoteId;
        return this;
    }

    /**
     * Matched income id. Required in case of matching to income
     * 
     */
    @JsonProperty("incomeId")
    public String getIncomeId() {
        return incomeId;
    }

    /**
     * Matched income id. Required in case of matching to income
     * 
     */
    @JsonProperty("incomeId")
    public void setIncomeId(String incomeId) {
        this.incomeId = incomeId;
    }

    public Payment withIncomeId(String incomeId) {
        this.incomeId = incomeId;
        return this;
    }

    /**
     * Matched bank/cash transaction id. Required in case of matching to existing bank/cash transaction
     * 
     */
    @JsonProperty("paymentTransactionId")
    public String getPaymentTransactionId() {
        return paymentTransactionId;
    }

    /**
     * Matched bank/cash transaction id. Required in case of matching to existing bank/cash transaction
     * 
     */
    @JsonProperty("paymentTransactionId")
    public void setPaymentTransactionId(String paymentTransactionId) {
        this.paymentTransactionId = paymentTransactionId;
    }

    public Payment withPaymentTransactionId(String paymentTransactionId) {
        this.paymentTransactionId = paymentTransactionId;
        return this;
    }

    /**
     * Id of account, on which payment is done
     * (Required)
     * 
     */
    @JsonProperty("paymentAccountId")
    public String getPaymentAccountId() {
        return paymentAccountId;
    }

    /**
     * Id of account, on which payment is done
     * (Required)
     * 
     */
    @JsonProperty("paymentAccountId")
    public void setPaymentAccountId(String paymentAccountId) {
        this.paymentAccountId = paymentAccountId;
    }

    public Payment withPaymentAccountId(String paymentAccountId) {
        this.paymentAccountId = paymentAccountId;
        return this;
    }

    /**
     * When transferring between accounts, id of account matched to this payment
     * 
     */
    @JsonProperty("matchedPaymentAccountId")
    public String getMatchedPaymentAccountId() {
        return matchedPaymentAccountId;
    }

    /**
     * When transferring between accounts, id of account matched to this payment
     * 
     */
    @JsonProperty("matchedPaymentAccountId")
    public void setMatchedPaymentAccountId(String matchedPaymentAccountId) {
        this.matchedPaymentAccountId = matchedPaymentAccountId;
    }

    public Payment withMatchedPaymentAccountId(String matchedPaymentAccountId) {
        this.matchedPaymentAccountId = matchedPaymentAccountId;
        return this;
    }

    /**
     * When transferring between accounts, id of bank/cash transaction matched to this payment
     * 
     */
    @JsonProperty("matchedPaymentTransactionId")
    public String getMatchedPaymentTransactionId() {
        return matchedPaymentTransactionId;
    }

    /**
     * When transferring between accounts, id of bank/cash transaction matched to this payment
     * 
     */
    @JsonProperty("matchedPaymentTransactionId")
    public void setMatchedPaymentTransactionId(String matchedPaymentTransactionId) {
        this.matchedPaymentTransactionId = matchedPaymentTransactionId;
    }

    public Payment withMatchedPaymentTransactionId(String matchedPaymentTransactionId) {
        this.matchedPaymentTransactionId = matchedPaymentTransactionId;
        return this;
    }

    /**
     * Account integration type
     * 
     */
    @JsonProperty("integrationType")
    public Payment.IntegrationType getIntegrationType() {
        return integrationType;
    }

    /**
     * Account integration type
     * 
     */
    @JsonProperty("integrationType")
    public void setIntegrationType(Payment.IntegrationType integrationType) {
        this.integrationType = integrationType;
    }

    public Payment withIntegrationType(Payment.IntegrationType integrationType) {
        this.integrationType = integrationType;
        return this;
    }

    /**
     * Account money origination
     * 
     */
    @JsonProperty("paymentType")
    public Payment.PaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Account money origination
     * 
     */
    @JsonProperty("paymentType")
    public void setPaymentType(Payment.PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public Payment withPaymentType(Payment.PaymentType paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    /**
     * Date and time when payment was created
     * 
     */
    @JsonProperty("createdDate")
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * Date and time when payment was created
     * 
     */
    @JsonProperty("createdDate")
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Payment withCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * Amount of payment
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    /**
     * Amount of payment
     * (Required)
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Payment withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Invoice number
     * 
     */
    @JsonProperty("invoiceNumber")
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Invoice number
     * 
     */
    @JsonProperty("invoiceNumber")
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Payment withInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        return this;
    }

    /**
     * Credit note number
     * 
     */
    @JsonProperty("creditNoteNumber")
    public String getCreditNoteNumber() {
        return creditNoteNumber;
    }

    /**
     * Credit note number
     * 
     */
    @JsonProperty("creditNoteNumber")
    public void setCreditNoteNumber(String creditNoteNumber) {
        this.creditNoteNumber = creditNoteNumber;
    }

    public Payment withCreditNoteNumber(String creditNoteNumber) {
        this.creditNoteNumber = creditNoteNumber;
        return this;
    }

    /**
     * List of Expense/Income category ids
     * 
     */
    @JsonProperty("categoryIds")
    public List<String> getCategoryIds() {
        return categoryIds;
    }

    /**
     * List of Expense/Income category ids
     * 
     */
    @JsonProperty("categoryIds")
    public void setCategoryIds(List<String> categoryIds) {
        this.categoryIds = categoryIds;
    }

    public Payment withCategoryIds(List<String> categoryIds) {
        this.categoryIds = categoryIds;
        return this;
    }

    /**
     * Date of payment. Required in case of matching with transaction of manual cash/bank account
     * 
     */
    @JsonProperty("paymentDate")
    public String getPaymentDate() {
        return paymentDate;
    }

    /**
     * Date of payment. Required in case of matching with transaction of manual cash/bank account
     * 
     */
    @JsonProperty("paymentDate")
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Payment withPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }

    /**
     * Text of payment
     * 
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Text of payment
     * 
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    public Payment withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Defines payment currency
     * (Required)
     * 
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * Defines payment currency
     * (Required)
     * 
     */
    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Payment withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Customer name
     * 
     */
    @JsonProperty("customerName")
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Customer name
     * 
     */
    @JsonProperty("customerName")
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Payment withCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    /**
     * Supplier name
     * 
     */
    @JsonProperty("supplierName")
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * Supplier name
     * 
     */
    @JsonProperty("supplierName")
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Payment withSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }

    /**
     * Transaction description, may contain customer or supplier name, bank info
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Transaction description, may contain customer or supplier name, bank info
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Payment withDescription(String description) {
        this.description = description;
        return this;
    }

    public enum IntegrationType {

        ONLINE("online"),
        OFFLINE("offline"),
        MANUAL("manual"),
        SYNC("sync"),
        EXTERNAL("external");
        private final String value;
        private final static Map<String, Payment.IntegrationType> CONSTANTS = new HashMap<String, Payment.IntegrationType>();

        static {
            for (Payment.IntegrationType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private IntegrationType(String value) {
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
        public static Payment.IntegrationType fromValue(String value) {
            Payment.IntegrationType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum PaymentType {

        BANK("bank"),
        CASH("cash");
        private final String value;
        private final static Map<String, Payment.PaymentType> CONSTANTS = new HashMap<String, Payment.PaymentType>();

        static {
            for (Payment.PaymentType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private PaymentType(String value) {
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
        public static Payment.PaymentType fromValue(String value) {
            Payment.PaymentType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
