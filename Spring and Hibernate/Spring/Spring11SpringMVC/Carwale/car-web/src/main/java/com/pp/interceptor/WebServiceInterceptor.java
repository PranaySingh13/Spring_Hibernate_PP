package com.pp.interceptor;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.pp.model.WebServiceModel;
import com.pp.repo.WebServiceRepository;

public class WebServiceInterceptor extends HandlerInterceptorAdapter {

	@Autowired
	private WebServiceRepository webServiceRepository;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
	
		System.out.println("Inside Pre Handle of Web Interceptor "+request.getHeader("uemail")+" "+request.getHeader("upassword"));
		List<WebServiceModel> list = new ArrayList<WebServiceModel>();
		String uemail = request.getHeader("uemail");
		String upassword = request.getHeader("upassword");
		list = webServiceRepository.restCallAuthentication(uemail, upassword);
		String errorFail ="Credentials Mismatch";
		String successMessage="Authentication Success";
		if(list.isEmpty()) {
			System.out.println("Authentication Failed");
			request.setAttribute("message", errorFail);
			return true;
		}
		else {
			System.out.println("Authentication Passed");
			request.setAttribute("message",successMessage);
			return true;
		}
		
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("inside post handle method of WebService");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("inside after completion method of WebService");
	}
}
