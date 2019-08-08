package com.ex1;

import java.util.Set;

public class Department {
	private String deptId;
	private String deptName;
	private Set<Employee> empSet;
	public Department(String deptId, String deptName, Set<Employee> empSet) {
		this.deptId = deptId;
		this.deptName = deptName;
		this.empSet = empSet;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", empSet=" + empSet + "]";
	}
	

}
