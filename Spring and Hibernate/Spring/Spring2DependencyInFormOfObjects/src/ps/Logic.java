package ps;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Logic {

	public static void main(String[] args) {

		Resource res1=new ClassPathResource("spconfig1.xml");
		BeanFactory factory1=new XmlBeanFactory(res1);	//BeanFactory factory=new XmlBeanFactory(resource)
		
		Resource res2=new ClassPathResource("spconfig2.xml");
		BeanFactory factory2=new XmlBeanFactory(res2,factory1); //BeanFactory factory=new XmlBeanFactory(resource, parentBeanFactory)
		
		Object o=factory2.getBean("id3");
		Journey j=(Journey)o;
		
		j.startJourney();
	
	}

}
