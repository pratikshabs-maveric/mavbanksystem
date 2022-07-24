package com.maveric.model;




import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "mavbank_dispute_reasons")
public class DisputeReasons {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int reasonId;
	
	

	private Date stoleOnDate;
	

	private Date reportOnDate;
	
	private int noOfTransaction;
	private int noOfTimesBilled;
	

	private Date deliveredDate;
	
	private Double authorisedAmount;
	private Double billedAmount;
	private Double atmBilledAmount;
	private Double atmRecievedAmount;
	private Double atmDisputeAmount;
	private String otherDetails;
	private String flag1;
	private String flag2;
	private String flag3;
	private String flag4;
	private String flag5;
	private String flag6;
	private String flag7;
	private String flag8;
	private String flag9;
	private String flag10;
	private String flag11;
	private String flag12;
	private String flag13;
	public int getReasonId() {
		return reasonId;
	}
	public void setReasonId(int reasonId) {
		this.reasonId = reasonId;
	}
	public Date getStoleOnDate() {
		return stoleOnDate;
	}
	public void setStoleOnDate(Date stoleOnDate) {
		this.stoleOnDate = stoleOnDate;
	}
	public Date getReportOnDate() {
		return reportOnDate;
	}
	public void setReportOnDate(Date reportOnDate) {
		this.reportOnDate = reportOnDate;
	}
	public int getNoOfTransaction() {
		return noOfTransaction;
	}
	public void setNoOfTransaction(int noOfTransaction) {
		this.noOfTransaction = noOfTransaction;
	}
	public int getNoOfTimesBilled() {
		return noOfTimesBilled;
	}
	public void setNoOfTimesBilled(int noOfTimesBilled) {
		this.noOfTimesBilled = noOfTimesBilled;
	}
	public Date getDeliveredDate() {
		return deliveredDate;
	}
	public void setDeliveredDate(Date deliveredDate) {
		this.deliveredDate = deliveredDate;
	}
	public Double getAuthorisedAmount() {
		return authorisedAmount;
	}
	public void setAuthorisedAmount(Double authorisedAmount) {
		this.authorisedAmount = authorisedAmount;
	}
	public Double getBilledAmount() {
		return billedAmount;
	}
	public void setBilledAmount(Double billedAmount) {
		this.billedAmount = billedAmount;
	}
	public Double getAtmBilledAmount() {
		return atmBilledAmount;
	}
	public void setAtmBilledAmount(Double atmBilledAmount) {
		this.atmBilledAmount = atmBilledAmount;
	}
	public Double getAtmRecievedAmount() {
		return atmRecievedAmount;
	}
	public void setAtmRecievedAmount(Double atmRecievedAmount) {
		this.atmRecievedAmount = atmRecievedAmount;
	}
	public Double getAtmDisputeAmount() {
		return atmDisputeAmount;
	}
	public void setAtmDisputeAmount(Double atmDisputeAmount) {
		this.atmDisputeAmount = atmDisputeAmount;
	}
	public String getOtherDetails() {
		return otherDetails;
	}
	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}
	public String getFlag1() {
		return flag1;
	}
	public void setFlag1(String flag1) {
		this.flag1 = flag1;
	}
	public String getFlag2() {
		return flag2;
	}
	public void setFlag2(String flag2) {
		this.flag2 = flag2;
	}
	public String getFlag3() {
		return flag3;
	}
	public void setFlag3(String flag3) {
		this.flag3 = flag3;
	}
	public String getFlag4() {
		return flag4;
	}
	public void setFlag4(String flag4) {
		this.flag4 = flag4;
	}
	public String getFlag5() {
		return flag5;
	}
	public void setFlag5(String flag5) {
		this.flag5 = flag5;
	}
	public String getFlag6() {
		return flag6;
	}
	public void setFlag6(String flag6) {
		this.flag6 = flag6;
	}
	public String getFlag7() {
		return flag7;
	}
	public void setFlag7(String flag7) {
		this.flag7 = flag7;
	}
	public String getFlag8() {
		return flag8;
	}
	public void setFlag8(String flag8) {
		this.flag8 = flag8;
	}
	public String getFlag9() {
		return flag9;
	}
	public void setFlag9(String flag9) {
		this.flag9 = flag9;
	}
	public String getFlag10() {
		return flag10;
	}
	public void setFlag10(String flag10) {
		this.flag10 = flag10;
	}
	public String getFlag11() {
		return flag11;
	}
	public void setFlag11(String flag11) {
		this.flag11 = flag11;
	}
	public String getFlag12() {
		return flag12;
	}
	public void setFlag12(String flag12) {
		this.flag12 = flag12;
	}
	public String getFlag13() {
		return flag13;
	}
	public void setFlag13(String flag13) {
		this.flag13 = flag13;
	}
	
	@Override
	public String toString() {
		
		return "dispute_reasons [reasonId=" + reasonId + ", stoleOnDate=" + stoleOnDate
				+ ", reportOnDate=" + reportOnDate + ", noOfTransaction=" + noOfTransaction + ", noOfTimesBilled="
				+ noOfTimesBilled + ", deliveredDate=" + deliveredDate + ", authorisedAmount=" + authorisedAmount
				+ ", billedAmount=" + billedAmount + ", atmBilledAmount=" + atmBilledAmount + ", atmRecievedAmount="
				+ atmRecievedAmount + ", atmDisputeAmount=" + atmDisputeAmount + ", otherDetails=" + otherDetails
				+ ", flag1=" + flag1 + ", flag2=" + flag2 + ", flag3=" + flag3 + ", flag4=" + flag4 + ", flag5=" + flag5
				+ ", flag6=" + flag6 + ", flag7=" + flag7 + ", flag8=" + flag8 + ", flag9=" + flag9 + ", flag10="
				+ flag10 + ", flag11=" + flag11 + ", flag12=" + flag12 + ", flag13=" + flag13 + "]";
	}
	
}
