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
		public Query setFirstResult(int rowno) specifies the row number 
		from where record will be retrieved. 
		public Query setMaxResult(int rowno) specifies the no. of records
		to be retrieved from the relation (table).
		*/	
		
		String hql = "FROM StudentDto";
		Query query = s.createQuery(hql);
		query.setFirstResult(0);
		query.setMaxResults(3);
		
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
