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
		
		String hql=" FROM StudentDto S WHERE S.sid<9 ORDER BY S.sname asc, S.smarks asc";
		/*
		To sort your HQL query's results, you will need to use the ORDER BY clause
		You can order the results by any property on the objects in the result 
		set either ascending or descending .
		If you wanted to sort by more than one property, you would just add the 
		additional properties to the end of the order by clause, separated by commas.
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
