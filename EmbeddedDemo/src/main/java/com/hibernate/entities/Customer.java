package com.hibernate.entities;





import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection; 

@Entity
public class Customer {
	@Id
	private String emailId;
	private String name;
	
	@ElementCollection
	@JoinTable(name="CustomerAddress",joinColumns=@JoinColumn(name="Email"))
	private Set<Address> ad=new HashSet<Address>();
	
	
	
	public Customer() {
		
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String emailId, String name, Set<Address> ad) {
		this.emailId = emailId;
		this.name = name;
		this.ad = ad;
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
	public void setName(String name) {
		this.name = name;
	}
	public Set<Address> getAd() {
		return ad;
	}
	public void setAd(Set<Address> ad) {
		this.ad = ad;
	}
	

	
	
	

	

}
