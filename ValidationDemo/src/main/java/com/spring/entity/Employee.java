package com.spring.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



public class Employee {
	
	@NotNull
	@Min(1)
	private Integer employeeId;
	
	@NotEmpty(message="Name is required")
	@Size(min=3,max=12)
	private String employeeName;
	
	@Email(message="Give proper email format")
	@NotEmpty
	private String email;
	
	@NotEmpty
	@Pattern(regexp="[789][0-9]{9}")
	private String contact;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	

}
