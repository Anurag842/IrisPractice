package com.spring.annotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=DepartmentIdValidator.class)
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface DepartmentID {
	
	public String value() default "DEPT";
	public String message() default "Must Start with DEPT";
	public Class<?>[] groups() default{};
	public Class <? extends Payload>[] payload() default{};
	
	

}
