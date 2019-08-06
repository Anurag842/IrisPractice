package com.hibernate.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column; 

@Entity
public class Customer {
	@Id
	private String emailId;
	private String name;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="houseNo",column=@Column(name="hNo1")),
		@AttributeOverride(name="locality",column=@Column(name="locality1")),
		@AttributeOverride(name="city",column=@Column(name="city1")),
	})
	private Address addr1;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="houseNo",column=@Column(name="hNo2")),
		@AttributeOverride(name="locality",column=@Column(name="locality2")),
		@AttributeOverride(name="city",column=@Column(name="city2")),
	})
	private Address addr2;
	
	
	
	public Customer() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	public Customer(String emailId, String name, Address addr1, Address addr2) {
		this.emailId = emailId;
		this.name = name;
		this.addr1 = addr1;
		this.addr2 = addr2;
	}


	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Customer [emailId=" + emailId + ", name=" + name + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddr1() {
		return addr1;
	}
	public void setAddr1(Address addr1) {
		this.addr1 = addr1;
	}
	public Address getAddr2() {
		return addr2;
	}
	public void setAddr2(Address addr2) {
		this.addr2 = addr2;
	}
	

}
