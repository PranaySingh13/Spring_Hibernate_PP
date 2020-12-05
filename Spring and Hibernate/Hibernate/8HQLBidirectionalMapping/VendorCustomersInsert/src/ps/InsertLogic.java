package ps;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertLogic {

	public static void main(String[] args) {

		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx=s.beginTransaction();
		
		Vendor v1= new Vendor();
		v1.setVendorId(1);
		v1.setVendorName("P Singh");
		
		Vendor v2= new Vendor();
		v2.setVendorId(2);
		v2.setVendorName("A Singh");
		
		Customers c1=new Customers();
		c1.setCustomerId(1);
		c1.setCustomerName("bank1");
		
		
		Customers c2=new Customers();
		c2.setCustomerId(2);
		c2.setCustomerName("bank2");
		
		
		Customers c3=new Customers();
		c3.setCustomerId(3);
		c3.setCustomerName("bank3");
		
		
		Customers c4=new Customers();
		c4.setCustomerId(4);
		c4.setCustomerName("bank4");
		
		//One to Many Mapping
		
		Set s1=new HashSet();
		s1.add(c1);
		s1.add(c2);
		
		Set s2=new HashSet();
		s2.add(c3);
		s2.add(c4);
		
		v1.setChild(s1);
		v2.setChild(s2);
		
		
		//Many to One Mapping
		c1.setParentObject(v1);
		c2.setParentObject(v1);
		c3.setParentObject(v2);
		c4.setParentObject(v2);
		
		s.save(c1);
		s.save(c2);
		s.save(c3);
		s.save(c4);
		
		/*
		s.save(v1);
		s.save(v2);
		*/
		
		tx.commit();
		s.close();
		
		System.out.println("Many to one Insert is done...");

	}

}
