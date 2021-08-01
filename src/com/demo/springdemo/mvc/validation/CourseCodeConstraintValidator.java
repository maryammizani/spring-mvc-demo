package com.demo.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{

	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode iCourseCode) { // iCourseCode is an object that implements @interface CourseCode
		//CourseCode(value="Demo", message="must start with Demo"
		// iCourseCode.value() returns the attribute:value of that annotation
		coursePrefix = iCourseCode.value();   
	}
	
	@Override
	public boolean isValid(String iCode, ConstraintValidatorContext iConstraintValidatorContext) {
		// isValid is called when form is submitted
		// iCode is what user has entered in the html form
		// ConstrainsValidatorContext is passed to isValid in case we want to add additional validations
		boolean result;
		if(iCode != null) {
			result = iCode.startsWith(coursePrefix);
			return result;
		} else {
			result = true;
		}
		return result;
	}
}
