package ps;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Logic {

	public static void main(String[] args) {

		Resource res=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		
		EmployeeDao dao=(EmployeeDao)factory.getBean("d");
		
		Employee e1=new Employee();
		e1.setId(1);
		e1.setName("Pranay");
		e1.setSalary(100.200f);	
		
		dao.saveEmployee(e1);
		
	}
	
}
