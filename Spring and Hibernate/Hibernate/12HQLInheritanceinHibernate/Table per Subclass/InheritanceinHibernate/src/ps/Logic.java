package ps;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();		
		Transaction tx = s.beginTransaction();
		
		Employee e1=new Employee();    
	    e1.setName("Gaurav Chawla");    
	        
	    Regular_Employee e2=new Regular_Employee();    
	    e2.setName("Vivek Kumar");    
	    e2.setSalary(50000);    
	    e2.setBonus(5);    
	        
	    Contract_Employee e3=new Contract_Employee();    
	    e3.setName("Arjun Kumar");    
	    e3.setPay_per_hour(1000);    
	    e3.setContract_duration("15 hours");    
	        
	    s.persist(e1);    
	    s.persist(e2);    
	    s.persist(e3);    
	        
	    tx.commit();    
	    s.close();    
	    System.out.println("success");    
	}

}
