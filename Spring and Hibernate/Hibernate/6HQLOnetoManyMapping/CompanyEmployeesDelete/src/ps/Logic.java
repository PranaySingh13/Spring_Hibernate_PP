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
		
		Object o1=s.get(Employees.class, new Integer(4));
		Employees e1=(Employees)o1;
		s.delete(e1);
		
		Object o2=s.get(Company.class, new Integer(2));
		Company e2=(Company)o2;
		s.delete(e2);
		
		tx.commit();
		s.close();
		System.out.println("one to many delete operation done....");
	}

}
