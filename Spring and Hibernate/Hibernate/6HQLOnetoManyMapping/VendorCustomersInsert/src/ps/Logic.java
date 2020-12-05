package ps;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic {

	public static void main(String[] args) {
		
		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf=c.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		//creating 2 parent object 
		Vendor v1=new Vendor();
		v1.setVendorId(1);
		v1.setVendorName("Pranay Singh");

		Vendor v2=new Vendor();
		v2.setVendorId(2);
		v2.setVendorName("Apoorva Singh");
		
		//creating 6 child object
		Customers c1=new Customers();
		c1.setCustomerId(1);
		c1.setCustomerName("Apple");
		
		Customers c2=new Customers();
		c2.setCustomerId(2);
		c2.setCustomerName("Samsung");
		
		Customers c3=new Customers();
		c3.setCustomerId(3);
		c3.setCustomerName("Vivo");
		
		Customers c4=new Customers();
		c4.setCustomerId(4);
		c4.setCustomerName("Surya");
		
		Customers c5=new Customers();
		c5.setCustomerId(5);
		c5.setCustomerName("Havels");
		
		Customers c6=new Customers();
		c6.setCustomerId(6);
		c6.setCustomerName("Crompton");
		
		//adding child objects to set, as we taken 3rd property set in parent
		Set s1=new HashSet(); //first set for first vendor.
		s1.add(c1);
		s1.add(c2);
		s1.add(c3);
		
		Set s2=new HashSet(); //second set for second vendor.
		s2.add(c4);
		s2.add(c5);
		s2.add(c6);
		
		v1.setChild(s1);
		v2.setChild(s2);
		
		s.save(v1);
		s.save(v2);
		
		tx.commit();
		s.close();
		System.out.println("One To Many is Done..!!");
		sf.close();

	}

}
