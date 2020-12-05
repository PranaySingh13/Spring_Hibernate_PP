package com.aartek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.Customer;
import com.aartek.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository cr;
	
	public void saveRecord(Customer customer) {
		cr.save(customer);
	}
}
