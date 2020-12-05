package fifthhb;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;


public class StudentDao {

	public static void main(String[] args) throws Exception {
		
		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf=c.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		Criteria cr=s.createCriteria(StudentDto.class);
		
		//Pagination with Criteria.
		
		cr.setFirstResult(0);
		cr.setMaxResults(8);
		
		List<?> results=cr.list();
		for(Iterator<?> it=results.iterator(); it.hasNext();) {
		
			StudentDto st1=(StudentDto)it.next();
			System.out.println(+st1.getSid()+" "+st1.getSname());
		}
		
		tx.commit();
		s.close();
		
	}

}
