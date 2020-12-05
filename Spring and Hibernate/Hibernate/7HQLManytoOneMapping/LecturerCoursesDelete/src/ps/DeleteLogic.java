package ps;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteLogic {

	public static void main(String[] args) {

		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx=s.beginTransaction();
		
		Object o=s.get(Courses.class,new Integer(4));
		Courses c1=(Courses)o;
		c1.setParentObject(null);
		s.delete(c1);
		
		tx.commit();
		s.close();
		System.out.println("Many to One Mapping deleting is done.........");
	}

}
