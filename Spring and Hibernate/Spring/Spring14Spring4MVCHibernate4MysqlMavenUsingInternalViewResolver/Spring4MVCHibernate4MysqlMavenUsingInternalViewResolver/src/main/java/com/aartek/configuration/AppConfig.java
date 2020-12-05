package com.aartek.configuration;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc //is equivalent to mvc:annotation-driven in XML.
@ComponentScan(basePackages="com.aartek") //referes to package locations to find the associated beans.
public class AppConfig {

	
	//Method viewResolver configures a view resolver to identify the real view.
	@Bean
	public ViewResolver viewresolver() {
	
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	// To override those default error messages by your own custom [internationalized] messages from an external Message bundle [.properties file], we need to configure a ResourceBundleMessageSource.
	@Bean
	public MessageSource messageSource() {
	 
		ResourceBundleMessageSource messageSource=new ResourceBundleMessageSource();
		messageSource.setBasename("messages"); // Spring will search for a file named messages.properties in application class path. 
		return messageSource;
	}	
	
}
