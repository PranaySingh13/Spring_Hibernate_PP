package com.pp.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pp.model.WebServiceModel;

@Repository
public class WebServiceRepository {

	@Autowired
	private HibernateTemplate template;

	public void saveWebServiceData(WebServiceModel serviceModel) {

		System.out.println("Inside WebService Repository"+serviceModel.getUemail());
		template.save(serviceModel);
	}
	
	public List<WebServiceModel> getWebModelDetails(){
		
		System.out.println("Get All Web Model Details");
		List<WebServiceModel> ls=template.find("from WebServiceModel");
		return ls;
	}
	
	public void updateModelDataById(WebServiceModel serviceModel,int id) {
		System.out.println("Inside update web service data by id");
		WebServiceModel model=(WebServiceModel)template.get(WebServiceModel.class, id);
		if(model !=null) {
			model.setUid(id);
			model.setUfirstName(serviceModel.getUfirstName());
			model.setUlastName(serviceModel.getUlastName());
			model.setUemail(serviceModel.getUemail());
			model.setUpassword(serviceModel.getUpassword());
			model.setUcontact(serviceModel.getUcontact());
			template.update(model);
		}
		else {
			System.out.println("Data With Id"+id+"Not Found");
		}
	}
	
	public void deleteModelDataById(int id) {
		System.out.println("Inside Delete Service Data By Id");
		template.delete(template.get(WebServiceModel.class, id));
	}
	
	public List<WebServiceModel> restCallAuthentication(String uemail, String upassword) {
		System.out.println("Inside Rest authentication Method " + uemail + " " + upassword);
		List<WebServiceModel> ls = template.find("from WebServiceModel us where us.uemail = ? and us.upassword = ?", uemail, upassword);
		System.out.println(ls);
		return ls;
	}

}
