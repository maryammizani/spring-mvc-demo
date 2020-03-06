package com.demo.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	// Controller method to show the form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// Controller method to process the form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// Controller method to process the form and add data to the model
	@RequestMapping("/processForm2")
	public String processForm2(HttpServletRequest iRequest, Model iModel) {
		
		// Read Request params from HTML form
		String lName = iRequest.getParameter("studentName");
		
		// Convert data
		lName = lName.toUpperCase();
		
		// Create Message
		String lMessage = "Hello "+ lName;
		
		// Add Message to the model
		iModel.addAttribute("message", lMessage);
		
		return "helloworld";
		
	}
	
	// Controller method to process the form and add data to the model
		@RequestMapping("/processForm3")
		public String processForm3(
				@RequestParam("studentName") String iName,
				Model iModel) {
			
			// Convert data
			String lName = iName.toUpperCase();
			
			// Create Message
			String lMessage = "Hey "+ lName;
			
			// Add Message to the model
			iModel.addAttribute("message", lMessage);
			
			return "helloworld";
			
		}
}
