package ps;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;


public class Logic {

	public static void main(String[] args) {

		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf=c.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		Object o1=s.get(College.class,new Integer(2));
		College co1=(College)o1;
		co1.setCollegeName("Ips Academy");
		s.update(co1);
		
		Object o2=s.get(Students.class,new Integer(5));
		Students co2=(Students)o2;
		co2.setStudentName("Shivam");
		s.update(co2);
		
		tx.commit();
		s.close();
		System.out.println("One To Many is Done for updating..!!");
	}

}
