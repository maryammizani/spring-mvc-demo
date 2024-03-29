package com.demo.springdemo.mvc.validation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

	// define default course code
	public String value() default "Demo";
	
	// define default error message
	public String message() default "must start with Demo";
	
	// define default groups
	public Class<?>[] groups() default {};
	
	// define default payload
	public Class<? extends Payload>[] payload() default {};
}
