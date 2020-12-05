package com.pp.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pp.model.User;
import com.pp.validator.RegistrationValidator;
import com.pp.service.RegistrationService;

@Controller
public class RegistrationController {

	@Autowired
	private RegistrationService registrationService;
	
	@Autowired
	private RegistrationValidator registrationValidator; 
	
/*	
	
	//First Process of get
	@RequestMapping("/ShowRegistration")
	public String viewRegistration(Map<String,Object> map) {
	
		System.out.println("Inside register Controller");
		User user=new User();
		map.put("userObjectR", user);
		return "Registration";
	}
	
	
	Map is replaced by Model Interface because model acts as a 
	the model works a container that contains the data of the application.
	The object of HttpServletRequest reads the information provided by the user and pass it to the Model interface.
	
	//Second Process of get
	@RequestMapping("/ShowRegistration")
	public String viewRegistration(Model model) {
		
		System.out.println("Inside register Controller");
		User user=new User();
		model.addAttribute("userObjectR", user);
		return "Registration";
	}
	
	//First Process of Post
	@RequestMapping(value= "/register" , method=RequestMethod.POST)
	public String signAction(@Valid @ModelAttribute("userObjectR") User user , BindingResult result, ModelMap model) {
		
		System.out.println("Inside Post Registration Controller");
		registrationValidator.validate(user,result);
		System.out.println("below validate method");
		if (result.hasErrors()) {
			System.out.println("inside if condition");
			return "Registration";
		} 
		else {
		System.out.println("FirstName is:"+user.getFirstName());
		System.out.println("LastName is:"+user.getLastName());
		System.out.println("Contact No. is:"+user.getContact());
		System.out.println("Email is:"+user.getEmail());
		System.out.println("Password is:"+user.getPassword());
			
		registrationService.register(user);
		model.put("userObject", new User());
		return "Login";		
		}
	}
	
	
	//Second Process of Post
	@RequestMapping(value= "/register" , method=RequestMethod.POST)
	public String signAction(@ModelAttribute("userObjectR") User user , BindingResult result, Model model) {
		
		System.out.println("Inside Post Registration Controller");
		registrationValidator.validate(user,result);
		System.out.println("below validate method");
		if (result.hasErrors()) {
			System.out.println("inside if condition");
			return "Registration";
		} 
		else {
		System.out.println("FirstName is:"+user.getFirstName());
		System.out.println("LastName is:"+user.getLastName());
		System.out.println("Contact No. is:"+user.getContact());
		System.out.println("Email is:"+user.getEmail());
		System.out.println("Password is:"+user.getPassword());
			
		registrationService.register(user);
		model.addAttribute("userObject", new User());
		return "Login";		
		}
	}
	*/
	
	
	//Third Process of Common Method Merging
	@RequestMapping(value="/ShowRegistration" , method= {RequestMethod.GET,RequestMethod.POST})
	public String viewRegistration(@ModelAttribute("userObjectR") User user , BindingResult result, Model model,HttpServletRequest request) {
	
		String method=request.getMethod();
		if(("GET").equals(method)) {
			System.out.println("Inside register Controller");
			//User user=new User();
			model.addAttribute("userObjectR", user);
			return "Registration";
		} 
		//in else part post logic will be executed
		else {
			System.out.println("Inside Post Registration Controller");
			registrationValidator.validate(user,result);
			System.out.println("below validate method");
			if (result.hasErrors()) {
				System.out.println("inside if condition");
				return "Registration";
			} 
			else {
			System.out.println("FirstName is:"+user.getFirstName());
			System.out.println("LastName is:"+user.getLastName());
			System.out.println("Contact No. is:"+user.getContact());
			System.out.println("Email is:"+user.getEmail());
			System.out.println("Password is:"+user.getPassword());
				
			registrationService.register(user);
			model.addAttribute("userObject", new User());
			return "Login";		
			}	
		}
	}
	
}