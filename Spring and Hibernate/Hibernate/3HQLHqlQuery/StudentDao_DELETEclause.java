package thirdhb_hql;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDao {

	public static void main(String[] args) throws Exception {
		
		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf=c.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		/*
		The Query interface now contains a method called executeUpdate for executing HQL UPDATE or
		DELETE statements.The DELETE clause can be used to delete one or more objects.
		*/	
		
		String hql=" DELETE FROM StudentDto AS S WHERE S.sid= :stud_id";
		Query query=s.createQuery(hql);
		query.setParameter("stud_id", 7);
		int result=query.executeUpdate();
		System.out.println("Records Deleted: "+result);
		
		
		tx.commit();
		s.close();

	}

}
