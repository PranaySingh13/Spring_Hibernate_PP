package com.pp.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.pp.model.User;

@Component
public class RegistrationValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return User.class.isAssignableFrom(clazz);
	}
	
	public void validate(Object target, Errors errors) {
		
		User user= (User) target;
		System.out.println("Inside validate in Registration validator");
		/*
		//ValidationUtils.rejectIfEmpty(errors, field, errorCode, defaultMessage); will work because default message is display message of error code provided
      	//First Process of validation
		ValidationUtils.rejectIfEmpty(errors, "firstName","firstName.empty", "Enter the firstname");
		ValidationUtils.rejectIfEmpty(errors, "lastName", "lastName.empty","Enter the lastname");
      	ValidationUtils.rejectIfEmpty(errors, "email","email.empty", "Enter the email");
      	ValidationUtils.rejectIfEmpty(errors, "password","password.empty", "Enter the password");
      	ValidationUtils.rejectIfEmpty(errors, "contact","contact.empty", "Enter the contactNo");
      	*/
		
		
		/*ValidationUtils.rejectIfEmpty(errors, field, errorCode);  will work for message.properties*/
		//Second Process of Validation
		//errorcode or key=TypeOfMessage.AttributeName.TypeOfCondition
		
		ValidationUtils.rejectIfEmpty(errors, "firstName","error.firstName.empty");
		ValidationUtils.rejectIfEmpty(errors, "lastName", "error.lastName.empty");
      	ValidationUtils.rejectIfEmpty(errors, "email","error.email.empty");
      	ValidationUtils.rejectIfEmpty(errors, "password","error.password.empty");
      	ValidationUtils.rejectIfEmpty(errors, "contact","error.contact.empty");
		
      	
      	
      	if( user.getFirstName().trim().length()>10) {
      		errors.rejectValue("firstName","firstName.required","Enter the firstname less than 10 Characters");
      	}
      	if(user.getLastName().trim().length()>10) {
      		errors.rejectValue("lastName","lastName.required","Enter the lastname less than 10 Characters");
      	}
      	if(!user.getEmail().endsWith("@gmail.com")) {
      		errors.rejectValue("email","email.required","Email Should be of Gmail");
      	}
      	if(user.getPassword().trim().length()<8 || user.getPassword().trim().length()>11) {
      		errors.rejectValue("password","password.required","Invalid Password");
      	}
      	
      	if(user.getContact()<9000000000l || user.getContact()>=9999999999l) {
      		errors.rejectValue("contact","contact.required","Invalid Contact Range");
      	}
	}
}
