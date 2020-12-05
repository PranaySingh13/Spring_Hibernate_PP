package ps;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Demobean implements InitializingBean , DisposableBean   {
 
	private String name;
	private String password;
	
	public Demobean(String name, String password) {
		this.name = name;
		this.password = password;
		System.out.println("constructor called");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("name setter called"+name);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		System.out.println("password setter called" +password);
	}
	
	//it must be initialized in config.xml
	public void init() {
		System.out.println("Init method called");
	}
	
	//destory method is of DisposableBean interface
	public void destroy() {
		System.out.println("destroy method called");
	}
		
	//afterPropertiesSet() method is of InitializingBean interface
	public void afterPropertiesSet() {
		System.out.println("after method called");
		
	}

	
}
