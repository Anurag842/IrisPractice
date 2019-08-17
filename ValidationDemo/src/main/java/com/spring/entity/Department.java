package com.spring.entity;

import com.spring.annotations.DepartmentID;

public class Department {
	
	
	
	private Integer departmentId;
	@DepartmentID(value="DEPT",message="Must start with DEPt")
	private String departmentName;

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	

}
