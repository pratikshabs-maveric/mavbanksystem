package com.maveric.model;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mavbank_dispute_customer_details")
public class DisputeCustomerDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int disputeId;
	
	private String customerName;
	private String cardNumber;
	private String accountNumber;
	private String emailId;
	private String mobileNumber;
	
	private Date presentDate;
	
	private long fk_customerId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_reasonId")
	private DisputeReasons disputeReasons;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_disputeId")
	private List<DisputeTransactionDetails> disputeTransactionDetails;
	
	
	
	public List<DisputeTransactionDetails> getDisputeTransactionDetails() {
		return disputeTransactionDetails;
	}

	public void setDisputeTransactionDetails(List<DisputeTransactionDetails> disputeTransactionDetails) {
		this.disputeTransactionDetails = disputeTransactionDetails;
	}

	public DisputeReasons getDisputeReasons() {
		return disputeReasons;
	}

	public void setDisputeReasons(DisputeReasons disputeReasons) {
		this.disputeReasons = disputeReasons;
	}

	public DisputeCustomerDetails()
	{
		
	}
	
	public DisputeCustomerDetails(int disputeId, String customerName, String cardNumber, String accountNumber, String emailId, String mobileNumber, Date presentDate, DisputeReasons disputeReasons,List<DisputeTransactionDetails> disputeTransactionDetails,long fk_customerId) 
	{
		super();
		this.disputeId = disputeId;
		this.customerName = customerName;
		this.cardNumber = cardNumber;
		this.accountNumber = accountNumber;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.presentDate = presentDate;
		this.disputeReasons = disputeReasons;
		this.disputeTransactionDetails = disputeTransactionDetails;
		this.fk_customerId = fk_customerId;
	}
	
	public  int getDisputeId() {
		return disputeId;
	}
	public void setDisputeId(int disputeId) {
		this.disputeId = disputeId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Date getPresentDate() {
		return presentDate;
	}
	public void setPresentDate(Date presentDate) {
		this.presentDate = presentDate;
	}

	public long getFk_customerId() {
		return fk_customerId;
	}

	public void setFk_customerId(long fk_customerId) {
		this.fk_customerId = fk_customerId;
	}
	
}
