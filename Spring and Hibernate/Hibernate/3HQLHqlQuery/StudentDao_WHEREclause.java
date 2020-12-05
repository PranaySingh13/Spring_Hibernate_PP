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
		
		String hql=" FROM StudentDto S WHERE S.sid=4";
		/*
		If you want to narrow the specific objects that are returned from storage, you use the WHERE clause.
		 */	
		Query query=s.createQuery(hql);
		List<?> results=query.list();
		
		Iterator<?> it=results.iterator();
		while(it.hasNext()) {
			StudentDto st1=(StudentDto)it.next();
			System.out.println(st1.getSid()+" "+st1.getSname()+" "+st1.getSmarks());
		}

		tx.commit();
		s.close();

	}

}
