package com.hibernate.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private int houseNo;
	private String locality;
	private String city;
	
	
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Address(int houseNo, String locality, String city) {
		this.houseNo = houseNo;
		this.locality = locality;
		this.city = city;
	}


	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", locality=" + locality + ", city=" + city + "]";
	}

}
