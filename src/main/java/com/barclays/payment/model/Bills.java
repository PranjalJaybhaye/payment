package com.barclays.payment.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Bills")
public class Bills {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int billsequenceid;
	private String billercode;
	private int consumernumber;
	private float amount;
	private Date duedate;
	private String billstatus;
	
	public Bills() {
		
	}

	public Bills(int billsequenceid, String billercode, int consumernumber, float amount, Date duedate,
			String billstatus) {
		super();
		this.billsequenceid = billsequenceid;
		this.billercode = billercode;
		this.consumernumber = consumernumber;
		this.amount = amount;
		this.duedate = duedate;
		this.billstatus = billstatus;
	}

	public int getBillsequenceid() {
		return billsequenceid;
	}

	public void setBillsequenceid(int billsequenceid) {
		this.billsequenceid = billsequenceid;
	}

	public String getBillercode() {
		return billercode;
	}

	public void setBillercode(String billercode) {
		this.billercode = billercode;
	}

	public int getConsumernumber() {
		return consumernumber;
	}

	public void setConsumernumber(int consumernumber) {
		this.consumernumber = consumernumber;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Date getDuedate() {
		return duedate;
	}

	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}

	public String getBillstatus() {
		return billstatus;
	}

	public void setBillstatus(String billstatus) {
		this.billstatus = billstatus;
	}

	@Override
	public String toString() {
		return "Bill [billsequenceid=" + billsequenceid + ", billercode=" + billercode + ", consumernumber="
				+ consumernumber + ", amount=" + amount + ", duedate=" + duedate + ", billstatus=" + billstatus + "]";
	}
}
