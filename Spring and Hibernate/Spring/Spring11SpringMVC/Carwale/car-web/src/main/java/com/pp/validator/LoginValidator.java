package com.pp.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.pp.model.User;

@Component
public class LoginValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return User.class.isAssignableFrom(clazz);
	}
	
public void validate(Object target, Errors errors) {
		
		User user= (User) target;
		System.out.println("Inside Login validate validator");
		/*ValidationUtils.rejectIfEmpty(errors, "email","email.empty", "Enter the email");
      	ValidationUtils.rejectIfEmpty(errors, "password","password.empty", "Enter the password");
      	*/
		
		//or
		
      	if(user==null) {
      		errors.rejectValue("email","email.required","Invalid Email or Password");
      		//errors.rejectValue("password","password.required","Invalid Password"); 
      		
      		/*commented because either email or password is wrong it will print both
      			the messages because user data is coming from database is null.*/
      	}
      	
	}
}
