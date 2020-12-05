package com.pp.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.pp.model.Product;

@Component
public class ProductValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return Product.class.isAssignableFrom(clazz);
	}
	
	public void validate(Object target, Errors errors) {
	
	Product p=(Product)target;
	
	System.out.println("Inside validate in Product validator");
	
	/*
	//First Process of Validation
	ValidationUtils.rejectIfEmpty(errors, "productName","productName.empty","Enter the Product Name");
	ValidationUtils.rejectIfEmpty(errors, "productDescription","productDescription.empty","Enter the Product Description");
	ValidationUtils.rejectIfEmpty(errors, "productPrice","productPrice.empty","Enter the Product Price");
	ValidationUtils.rejectIfEmpty(errors, "dateOfIssue","dateOfIssue.empty","Enter the Product dateOfIssue");
	*/
	
	//Second Process of Validation for message.properties file.
	
	//errorcode or key=TypeOfMessage.AttributeName.TypeOfCondition
	ValidationUtils.rejectIfEmpty(errors, "productName","error.productName.empty");
	ValidationUtils.rejectIfEmpty(errors, "productDescription","error.productDescription.empty");
	ValidationUtils.rejectIfEmpty(errors, "productPrice","error.productPrice.empty");
	ValidationUtils.rejectIfEmpty(errors, "dateOfIssue","error.dateOfIssue.empty");
	
	
	if(p.getProductName().trim().length()>10) {
		errors.rejectValue("productName","productName.required","Product Name Should be less than 10 Characters");
	}
	if(p.getProductDescription().trim().length()>10) {
		errors.rejectValue("productDescription","productDescription.required","Product Description Should be less than 10 Characters");
	}
	if(p.getProductPrice()<100000 || p.getProductPrice()>200000) {
		errors.rejectValue("productPrice","productPrice.required","Invalid Price Range");
	}
	if(p.getDateOfIssue().trim().length()>1234) {
		errors.rejectValue("dateOfIssue","dateOfIssue.required"," Product dateOfIssue is Invalid");
	}
	
  }
}
