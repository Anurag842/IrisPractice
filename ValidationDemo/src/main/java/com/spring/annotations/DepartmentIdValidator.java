package com.spring.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DepartmentIdValidator implements ConstraintValidator<DepartmentID, String> {
	
	private String deptPrefix;
	
	public void initialize(DepartmentID theId)
	{
		deptPrefix=theId.value();
	}


	public boolean isValid(String theDeptId, ConstraintValidatorContext theConstraintValidatorContext ) {
		boolean result;
		
		if(theDeptId!=null)
		{
			result=theDeptId.startsWith(deptPrefix);
		}
		else
		{
			result=true;
		}
		return result;
	}

}
