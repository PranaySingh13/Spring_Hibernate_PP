package com.aartek.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aartek.model.Product;
import com.aartek.service.ProductService;

@RestController
@RequestMapping("/prod")
public class ProductController {

	@Autowired
	private ProductService service;
	
	
	@GetMapping("/get")
	public ResponseEntity<List<Product>> getAllRecords(){
		return ResponseEntity.ok(service.getAllRecords());
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Product> getRecordById(@PathVariable int id){
		Optional<Product> pro=service.getRecordById(id);
		return ResponseEntity.ok(pro.get());
	}
	
	@PostMapping("/save")
	public ResponseEntity<Product> createRecord(@RequestBody Product pro){
		return ResponseEntity.ok(service.saveRecord(pro));
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Product> updateRecord(@PathVariable int id,@RequestBody Product pro){
		return ResponseEntity.ok(service.saveRecord(pro)); 
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Product> deleteRecordById(@PathVariable int id) {
		service.deleteRecordById(id);
		return ResponseEntity.ok().build();
	}
}
