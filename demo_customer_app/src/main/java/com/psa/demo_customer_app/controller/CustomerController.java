package com.psa.demo_customer_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.psa.demo_customer_app.entity.Customer;
import com.psa.demo_customer_app.repositiories.CustomerRepository;

@Controller
public class CustomerController {
	@Autowired
	CustomerRepository customerRepo;
	
	
	@RequestMapping("/showCustomer")
	public String showCustomer() {
		return "addCustomer";
	}
	
	@RequestMapping("/saveCustomer")
public String saveCustomer(@ModelAttribute("customer")Customer customer, ModelMap modelmap) {
		customerRepo.save(customer);
		modelmap.addAttribute("msg", "Detials are save");
return "addCustomer";
	}
	
	@RequestMapping("/listCustomer")
	public String listCustomer(ModelMap modelmap) {
		List<Customer> customer = customerRepo.findAll();
		modelmap.addAttribute("Customer", customer);
		 return "displayCustomer";
		
		
	}
	
	

}
