package com.ps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ps.repository.WebServiceModel;
import com.ps.repository.WebServiceRepository;

@Service
public class WebSrvService {

	@Autowired
	private WebServiceRepository webServiceRepository;

	public WebServiceModel saveRecord(WebServiceModel webServiceModel) {
		return webServiceRepository.save(webServiceModel);
	}

	public List<WebServiceModel> getAllRecords() {
		List<WebServiceModel> ls = webServiceRepository.findAll();
		return ls;
	}

	public Optional<WebServiceModel> getRecordById(int id) {
		return webServiceRepository.findById(id);
	}

	public void deleteRecordById(int id) {
		webServiceRepository.deleteById(id);
	}
	
}
