package com.maveric.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "mavbank_customer_master", uniqueConstraints = @UniqueConstraint(columnNames = {"userName"}))
public class MavCustomerMaster {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long customerId;
	
	private String customerName;
	private String emailId;
	private String phoneNumber;
	private String userName;
	private String userPassword;
	
	
	
	public MavCustomerMaster(String customerName, String emailId, String phoneNumber, String userName,
			String userPassword) {
		super();
		this.customerName = customerName;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.userName = userName;
		this.userPassword = userPassword;
	}
	
	


	public MavCustomerMaster() {
		// TODO Auto-generated constructor stub
	}



	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
	
}
