package com.barclays.payment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
	
	@Id
	@Column(name="loginid")
	private String LoginId;
	private String pwd;
	private int Roleid;
	private int SequenceID;
	
	public Users() {
		
	}

	public String getLoginId() {
		return LoginId;
	}

	public void setLoginId(String loginId) {
		this.LoginId = loginId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getRoleid() {
		return Roleid;
	}

	public void setRoleid(int roleid) {
		Roleid = roleid;
	}

	public int getSequenceID() {
		return SequenceID;
	}

	public void setSequenceID(int sequenceID) {
		SequenceID = sequenceID;
	}

	
	
	
	

}
