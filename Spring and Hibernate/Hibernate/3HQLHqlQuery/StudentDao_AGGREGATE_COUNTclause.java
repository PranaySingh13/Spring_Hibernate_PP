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
		HQL supports a range of aggregate methods, similar to SQL.
		They work the same way in HQL as in SQL. count(propertyname) shows
		The number of times a property occurs in the results
		*/	
		
		//String hql=" SELECT count(S.smarks) FROM StudentDto AS S ";
		
		String hql=" SELECT count(distinct S.smarks) FROM StudentDto AS S ";//The distinct keyword only counts the unique values in the row set.
		Query query=s.createQuery(hql);
		
		List<Long> results=query.list();
		
		for(Iterator<Long> it=results.iterator(); it.hasNext(); )
		{
			long n=(Long)it.next();
			System.out.println(n);
		}
		
		tx.commit();
		s.close();

	}

}
