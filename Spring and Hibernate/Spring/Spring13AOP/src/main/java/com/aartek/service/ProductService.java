package com.aartek.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.advice.TrackExecutionTime;
import com.aartek.dao.ProductRepository;
import com.aartek.model.Product;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	@TrackExecutionTime
	public List<Product> getAllRecords(){
		List<Product> ls=repository.findAll();
		return ls;
	}
	
	@TrackExecutionTime
	public Optional<Product> getRecordById(int id){
		Optional<Product> pro=repository.findById(id);
		return pro;
	}
	
	@TrackExecutionTime
	public Product saveRecord(Product product) {
		Product pro=repository.save(product);
		return pro;
	}
	
	@TrackExecutionTime
	public void deleteRecordById(int id) {
		repository.deleteById(id);
	}
}
