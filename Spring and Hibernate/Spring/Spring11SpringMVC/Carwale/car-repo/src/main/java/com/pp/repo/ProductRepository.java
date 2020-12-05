package com.pp.repo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pp.model.Product;


@Repository
public class ProductRepository {

	@Autowired
	  private HibernateTemplate template;
	
	public void saveDataRepo(Product p) {
		if(p!=null && p.getProductPrice()!=0) {
			
		System.out.println("Inside Product Repository");	
		System.out.println(p.getProductName());
		System.out.println(p.getProductDescription());
		System.out.println(p.getProductPrice());
		System.out.println(p.getDateOfIssue());
		
		template.save(p);
		
		System.out.println("Product is Saved in Database");
		}
		else {
			System.out.println("Empty Object. No Records Found");
		}
	}
	
	public List<Product> fetchDataRepo(){
		
		List<Product> prorepolist=template.find("from Product");
		return prorepolist;
	}
}
