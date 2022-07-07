package com.greatlearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.entity.Customer;
import com.greatlearning.service.ICustomerService;

@RestController
@RequestMapping("/CustomerResource")
public class CustomerController {
	
	@Autowired
	private ICustomerService customerService;


	
	@PostMapping(path="/new-customer")
	public Customer addCustomerDetails(@RequestBody Customer customer)
	{
		return customerService.save(customer);
	}
	
	@GetMapping(path="/find-customer/{customerId}")
	public Customer getCustomerDetails(@PathVariable("customerId")Integer customerId)
	{
		return customerService.findById(customerId);
	}
	
	@GetMapping(path = "/all-customers")
	public List<Customer> getAllCustomerDetails()
	{
		return customerService.findAll();
	}
	
}
