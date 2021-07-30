package com.demo.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model iModel) {
		
		Student lStudent = new Student();
		
		// Add Student object to the model attribute
		iModel.addAttribute("student", lStudent);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm4")
	public String processForm4(@ModelAttribute("student") Student iStudent) {
				
		System.out.println("Student: " + iStudent.getFirstName() + iStudent.getLastName());
		return "student-confirmation";
	}
}
