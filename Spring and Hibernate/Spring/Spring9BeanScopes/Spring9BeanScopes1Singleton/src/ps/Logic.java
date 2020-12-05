package ps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Logic {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("spconfig.xml");
		
		Object o1=context.getBean("id1");
		HelloWorld h1=(HelloWorld)o1;
		
		h1.setMessage("Object A");
		h1.getMessage(); //It will show output Object A.
		
		Object o2=context.getBean("id1");
		HelloWorld h2=(HelloWorld)o2;
		
		h2.getMessage(); //As the scope is singleton, Ioc container creates exactly one instance of object defined by bean defintion. 
		
		//we can see here by refer the hashcodes of object that n no of object have a single hashcode of first object created.
		System.out.println(h1); 
		
		System.out.println(h2);
	}

}
