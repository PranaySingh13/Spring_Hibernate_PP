package com.pp.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pp.model.Product;
import com.pp.model.User;
import com.pp.repo.ProductRepository;
import com.pp.validator.ProductValidator;

@Controller
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ProductValidator productValidator;
	
/*	
	//First Process of GET  
	@RequestMapping(value="/addProduct", method=RequestMethod.GET)
	public String showProduct(Map<String,Object> map) {
		System.out.println("Inside Show Product Controller");
		Product pro=new Product();
		map.put("proObject", pro);
		return "Product";
	}
	

	Map is replaced by Model Interface because model acts as a 
	the model works a container that contains the data of the application.
	The object of HttpServletRequest reads the information provided by the user and pass it to the Model interface.
	
	//Second Process of GET 
	@RequestMapping(value="/addProduct", method=RequestMethod.GET)
	public String showProduct(Model model) {
		System.out.println("Inside Show Product Controller");
		Product pro=new Product();
		model.addAttribute("proObject", pro);
		return "Product";
	}
	
	
	
	//First Process of POST 
	@RequestMapping(value="/addProduct", method=RequestMethod.POST)
	public String saveDataForProduct(@ModelAttribute("proObject") Product pro,BindingResult result, ModelMap model, HttpServletRequest request) {
		
		System.out.println("Inside save data product controller");
		
		productValidator.validate(pro, result);
		System.out.println("below validate method");
		
		if(result.hasErrors()) {
			System.out.println("Inside If Condition in product controller");
			return "Product";
		}
		
		else{
			productRepository.saveDataRepo(pro); //saving data in db
			model.addAttribute("proObject", new Product());
			System.out.println("After Saving");
			List<Product> procontlist=productRepository.fetchDataRepo();		//after saving fetching data 
			System.out.println("after fetching data");
			model.addAttribute("getAllProduct", procontlist);			
			return "Product";
		}
	}
	
	//Second Process of POST 
	@RequestMapping(value="/addProduct", method=RequestMethod.POST)
	public String saveDataForProduct(@ModelAttribute("proObject") Product pro,BindingResult result, Model model, HttpServletRequest request) {
		
		System.out.println("Inside save data product controller");
		
		productValidator.validate(pro, result);
		System.out.println("below validate method");
		
		if(result.hasErrors()) {
			System.out.println("Inside If Condition in product controller");
			return "Product";
		}
		
		else{
			productRepository.saveDataRepo(pro); //saving data in db
			model.addAttribute("proObject", new Product());
			System.out.println("After Saving");
			List<Product> procontlist=productRepository.fetchDataRepo();		//after saving fetching data 
			System.out.println("after fetching data");
			model.addAttribute("getAllProduct", procontlist);			
			return "Product";
		}
	}
	*/
	
	@RequestMapping(value="/addProduct" , method= {RequestMethod.GET,RequestMethod.POST})
	public String viewLogin(@ModelAttribute("proObject") Product pro , BindingResult result, Model model,HttpServletRequest request) {
	
		String method=request.getMethod();
		
		if(("GET").equals(method)){
			System.out.println("Inside Show Product Controller");
			//Product pro=new Product();
			model.addAttribute("proObject", pro);
			return "Product";
		}
		//in else part post logic will be executed
		else {
			System.out.println("Inside save data product controller");
			
			productValidator.validate(pro, result);
			System.out.println("below validate method");
			
			if(result.hasErrors()) {
				System.out.println("Inside If Condition in product controller");
				return "Product";
			}
			
			else{
				productRepository.saveDataRepo(pro); //saving data in db
				model.addAttribute("proObject", new Product());
				System.out.println("After Saving");
				List<Product> procontlist=productRepository.fetchDataRepo();		//after saving fetching data 
				System.out.println("after fetching data");
				model.addAttribute("getAllProduct", procontlist);			
				return "Product";
				
				
			}
		}
	}
}
	
	

