package com.barclays.payment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "registerbillers")
public class RegisterBillers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name= "sequenceid")
	Integer sequenceid;
	@Column(name = "billercode")
	String BillerCode;
	@Column(name = "consumernumber")
	Integer ConsumerNumber;
	@Column(name = "accountnumber")
	Integer AccountNumber;
	@Column(name = "autopay")
	Integer AutoPay;
	@Column(name = "autopaylimit")
	Float AutoPayLimit;
	
	public RegisterBillers() {
		
	}

	public Integer getRegisterBillerSequenceId() {
		return sequenceid;
	}

	public void setRegisterBillerSequenceId(Integer registerBillerSequenceId) {
		sequenceid = registerBillerSequenceId;
	}

	public String getBillerCode() {
		return BillerCode;
	}

	public void setBillerCode(String billerCode) {
		BillerCode = billerCode;
	}

	public Integer getConsumerNumber() {
		return ConsumerNumber;
	}

	public void setConsumerNumber(Integer consumerNumber) {
		ConsumerNumber = consumerNumber;
	}

	public Integer getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		AccountNumber = accountNumber;
	}

	public Integer getAutoPay() {
		return AutoPay;
	}

	public void setAutoPay(Integer autoPay) {
		AutoPay = autoPay;
	}

	public Float getAutoPayLimit() {
		return AutoPayLimit;
	}

	public void setAutoPayLimit(Float autoPayLimit) {
		AutoPayLimit = autoPayLimit;
	}
	
	
	
}
