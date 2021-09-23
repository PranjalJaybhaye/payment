package com.barclays.payment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "account")
public class Account {
	@Id
	@Column(name= "accountnumber")
	Integer Accountnumber;
	@Column(name="sequenceid")
	Integer SequenceiD;
	@Column(name="name")
	String Name;
	@Column(name="email")
	String Email;
	@Column(name="currentbalance")
	float Currentbalance;
	
	public Account() {
		
	}
	/*public Account(int accountnumber, int sequenceiD, String name, String email, float currentbalance) {
		super();
		Accountnumber = accountnumber;
		SequenceiD = sequenceiD;
		Name = name;
		Email = email;
		Currentbalance = currentbalance;
	}*/
	
	public int getAccountnumber() {
		return Accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		Accountnumber = accountnumber;
	}
	public int getSequenceiD() {
		return SequenceiD;
	}
	public void setSequenceiD(int sequenceiD) {
		SequenceiD = sequenceiD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public float getCurrentbalance() {
		return Currentbalance;
	}
	public void setCurrentbalance(float currentbalance) {
		Currentbalance = currentbalance;
	}
	
	
	
	
}
