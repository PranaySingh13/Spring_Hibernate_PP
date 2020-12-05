package com.ps.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

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

import com.ps.repository.WebServiceModel;
import com.ps.service.WebSrvService;


	@RestController
	@RequestMapping("/model")
	public class WebServiceController {

		@Autowired
		private WebSrvService webSrvService;

		@GetMapping("/get")
		public ResponseEntity<List<WebServiceModel>> getAllRecord(){
			
			return ResponseEntity.ok(webSrvService.getAllRecords());
		}
		
		@GetMapping("/get/{id}")
		public ResponseEntity<WebServiceModel> getRecordById(@PathVariable int id){
		
			Optional<WebServiceModel> webServiceModel=webSrvService.getRecordById(id);
			return ResponseEntity.ok(webServiceModel.get());
			
		}
		
		@PostMapping("/save")
		public ResponseEntity<WebServiceModel> createRecord(@RequestBody WebServiceModel webServiceModel){
			
			return ResponseEntity.ok(webSrvService.saveRecord(webServiceModel));
		}
		
		@PutMapping("/update/{id}")
		public ResponseEntity<WebServiceModel> updateRecord(@PathVariable int id,@RequestBody WebServiceModel webServiceModel){
			return ResponseEntity.ok(webSrvService.saveRecord(webServiceModel)); 
		}
		
		@DeleteMapping("/delete/{id}")
		public ResponseEntity deleteRecordById(@PathVariable int id) {
			
			webSrvService.deleteRecordById(id);
			return ResponseEntity.ok().build();
		}
}

