package com.pp.repo;

import com.pp.model.User;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RegistrationRepository {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void register(User register) {
		
		if(register!=null && register.getContact()!=0) {
		System.out.println("Inside Registration repository");
		
		System.out.println("FirstName is:"+register.getFirstName());
		System.out.println("LastName is:"+register.getLastName());
		System.out.println("Contact No. is:"+register.getContact());
		System.out.println("Email is:"+register.getEmail());
		System.out.println("Password is:"+register.getPassword());
		
		hibernateTemplate.save(register);
		
		System.out.println("Saved In Database");
		
		
		}
		
		else {
			System.out.println("Invalid Registration credenttials");
		}
	}
}
