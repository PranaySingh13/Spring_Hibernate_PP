package com.aartek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aartek.model.Customer;
import com.aartek.service.CustomerService;

@RestController
public class OrderController {

	@Autowired
	private CustomerService cs;

	@PostMapping("/placeOrder")
	public void placeOrder(@RequestBody Customer customer) {
		cs.saveRecord(customer);
	}

}
