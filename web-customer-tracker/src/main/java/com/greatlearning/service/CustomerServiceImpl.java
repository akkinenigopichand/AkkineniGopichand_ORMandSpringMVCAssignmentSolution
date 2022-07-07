package com.greatlearning.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.entity.Customer;
import com.greatlearning.repos.ICustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerRepository customerRepository;
	
	
	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}
	
	
	public Customer findById(int theId)
	{
		Optional<Customer> optional  = customerRepository.findById(theId);
		
		if (optional.isPresent()) 
		{
			return optional.get();
		}
		return null;
	}
	
	public Customer save(Customer theCustomer) {
		// TODO Auto-generated method stub
		customerRepository.save(theCustomer);
		return findById(theCustomer.getId());
	}


	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		Customer customer = findById(theId);
		
		if(customer!=null)
		{
			customerRepository.delete(customer);
		}
		
		
	}
	
	

	


	

}
