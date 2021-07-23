 package com.psa.demo_customer_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.psa.demo_customer_app.entity.Customer;
import com.psa.demo_customer_app.repositiories.CustomerRepository;

@RestController
public class CustomerRestController {
	@Autowired
	CustomerRepository customerRepo;
	
	@GetMapping(path = "/findAllCustomer")
	public List<Customer> findAllCustomer(){
		List<Customer> customer = customerRepo.findAll();
		return customer;
		
	}
	@PostMapping(path = "/findAllCustomer")
public void saveCustomer( @RequestBody Customer customer) {
		customerRepo.save(customer);
	
}
}
