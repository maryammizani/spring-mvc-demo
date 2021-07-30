package com.demo.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("customer")
public class CustomerController {
	
	@RequestMapping("showForm")
	public String showForm(Model iModel) {
		iModel.addAttribute("customer", new Customer()); // name, value
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer iCustomer,  // perform validation rules on iCustomer
			BindingResult iBindingResult) // Results of validation will be placed in the iBindingResult
	{  		
		if(iBindingResult.hasErrors()) {
			return "customer-form";
		} else {
			return "customer-confirmation";
		}			
	}

}
