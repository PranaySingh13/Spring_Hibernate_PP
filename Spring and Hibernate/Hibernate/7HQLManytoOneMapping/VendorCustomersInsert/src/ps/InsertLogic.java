package ps;

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
		v1.setVendorName("Pranay Singh");
		
		Vendor v2= new Vendor();
		v2.setVendorId(2);
		v2.setVendorName("Apoorva Singh");
		
		Customers c1=new Customers();
		c1.setCustomerId(1);
		c1.setCustomerName("TCS");
		c1.setParentObject(v1);
		
		Customers c2=new Customers();
		c2.setCustomerId(2);
		c2.setCustomerName("Infosys");
		c2.setParentObject(v1);
		
		Customers c3=new Customers();
		c3.setCustomerId(3);
		c3.setCustomerName("CHL");
		c3.setParentObject(v2);
		
		Customers c4=new Customers();
		c4.setCustomerId(4);
		c4.setCustomerName("AIMS");
		c4.setParentObject(v2);
		
		s.save(c1);
		s.save(c2);
		s.save(c3);
		s.save(c4);
		
		tx.commit();
		s.close();
		
		System.out.println("Many to one Insert is done...");

	}

}
