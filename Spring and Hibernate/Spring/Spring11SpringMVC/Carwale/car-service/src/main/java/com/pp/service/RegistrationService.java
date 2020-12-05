package com.pp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.model.User;
import com.pp.repo.RegistrationRepository;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepository registrationRepository; 

	public void register(User register) {
		
		System.out.println("Inside Registration Service");
		
		System.out.println("FirstName is:"+register.getFirstName());
		System.out.println("LastName is:"+register.getLastName());
		System.out.println("Contact No. is:"+register.getContact());
		System.out.println("Email is:"+register.getEmail());
		System.out.println("Password is:"+register.getPassword());
		
		registrationRepository.register(register);
		}
}
