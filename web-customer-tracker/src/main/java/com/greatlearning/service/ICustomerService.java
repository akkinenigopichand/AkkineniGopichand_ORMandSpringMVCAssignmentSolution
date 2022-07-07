package com.greatlearning.service;

import java.util.List;


import com.greatlearning.entity.Customer;

public interface ICustomerService {

	public List<Customer> findAll();
	
	public Customer findById(int theId);
	
	public Customer save(Customer theCustomer);
	
	public void deleteById(int theId);
	
	

	
}
