package com.barclays.payment.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "role")
public class Role {

	@Id
	Integer Roleid;
	String name;
	public Role() {
		
	}
	public Role(Integer roleid, String name) {
		super();
		Roleid = roleid;
		this.name = name;
	}
	public Integer getRoleid() {
		return Roleid;
	}
	public void setRoleid(Integer roleid) {
		Roleid = roleid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
