package com.pp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.model.WebServiceModel;
import com.pp.repo.WebServiceRepository;

@Service
public class WebSrvService {
	
	@Autowired
	private WebServiceRepository webServiceRepository;

	public void saveWebServiceFromServiceLayer(WebServiceModel serviceModel) {
		
		System.out.println("Inside WebService Service "+serviceModel.getUemail());
		webServiceRepository.saveWebServiceData(serviceModel);
	}
	
	public List<WebServiceModel> getAllValuesFromWebServiceModel(){
	
		List<WebServiceModel> ls=webServiceRepository.getWebModelDetails();
		return ls;
	}
	
	public void updateWebServiceDataById(WebServiceModel model,int id) {
	
		System.out.println("Inside Web Service Data Updata For Id" +id);
		webServiceRepository.updateModelDataById(model, id);
	}
	
	public void deleteWebServiceDataById(int id) {
		System.out.println("Inside Web Service Data Delete By Id");
		webServiceRepository.deleteModelDataById(id);
	}
}
