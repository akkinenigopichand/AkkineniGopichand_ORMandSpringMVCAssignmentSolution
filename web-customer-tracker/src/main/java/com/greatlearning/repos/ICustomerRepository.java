package com.greatlearning.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.greatlearning.entity.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer,Integer> {

	
	
}
