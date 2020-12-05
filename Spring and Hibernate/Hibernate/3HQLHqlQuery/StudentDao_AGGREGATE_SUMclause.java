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
		They work the same way in HQL as in SQL. sum(propertyname) shows
		The sum total of the property values
		*/	
		
		String hql=" SELECT sum(S.smarks) FROM StudentDto AS S ";
		Query query=s.createQuery(hql);
		
		List<Double> results=query.list();
		
		for(Iterator<Double> it=results.iterator(); it.hasNext(); )
		{
			double n=(Double)it.next();
			System.out.println(n);
		}
		
		tx.commit();
		s.close();

	}

}
