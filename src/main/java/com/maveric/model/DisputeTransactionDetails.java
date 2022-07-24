package com.maveric.model;

import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "mavbank_dispute_transaction_details")
public class DisputeTransactionDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int transactionId;
	
	
	Date transactionDate;
	private String merchantAtmName;
	private Double transactionAmount;
	private Double disputeAmount;
	private String transactionIntimationDetails;
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getMerchantAtmName() {
		return merchantAtmName;
	}
	public void setMerchantAtmName(String merchantAtmName) {
		this.merchantAtmName = merchantAtmName;
	}
	public Double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public Double getDisputeAmount() {
		return disputeAmount;
	}
	public void setDisputeAmount(Double disputeAmount) {
		this.disputeAmount = disputeAmount;
	}
	public String getTransactionIntimationDetails() {
		return transactionIntimationDetails;
	}
	public void setTransactionIntimationDetails(String transactionIntimationDetails) {
		this.transactionIntimationDetails = transactionIntimationDetails;
	}
	
	@Override
	public String toString() {
	return "dispute_transaction_details [transactionId=" + transactionId 
	+ ", transactionDate=" + transactionDate + ", merchantAtmName=" + merchantAtmName
	+ ", transactionAmount=" + transactionAmount + ", disputeAmount=" + disputeAmount
	+ ", transactionIntimationDetails=" + transactionIntimationDetails + "]";
	}
}
