package com.pp.repo;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.validation.BindingResult;

import com.pp.model.User;

@Repository
public class LoginRepository {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public User userSignIn(User login) {
		
		System.out.println("Inside Login Repository User SignIn Method ");
		System.out.println("Email is : "+login.getEmail());
		System.out.println("Password is : "+login.getPassword());
		return login;
		
	}
	
	
	public List<User> repoCheckin(String email,String password) {
		
		if(email != null && password != null) 
		{
			
		List<User> list=hibernateTemplate.find("from User u where u.email = ? and u.password = ?" , email, password);
		
		System.out.println(list);
		System.out.println("Inside Repository Check In method");
		return list;
			}
		else {
			return null;	
		}
		
	}	
}	
	

