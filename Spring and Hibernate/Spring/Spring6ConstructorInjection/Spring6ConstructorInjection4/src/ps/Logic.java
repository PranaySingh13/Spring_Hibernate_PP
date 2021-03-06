package ps;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Logic {

	public static void main(String[] args) {

		Resource res=new ClassPathResource("spconfig1.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		
		Object o=factory.getBean("id1");
		DemoBean db=(DemoBean)o;
		db.show();
	
		Object o1=factory.getBean("id2");
		DemoBean db1=(DemoBean)o1;
		db1.show();
	}

}
