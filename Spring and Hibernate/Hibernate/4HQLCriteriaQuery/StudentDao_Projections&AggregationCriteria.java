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
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;


public class StudentDao {

	public static void main(String[] args) throws Exception {
		
		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf=c.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		Criteria cr=s.createCriteria(StudentDto.class);
		
		//Projections & Aggregations with Criteria.
		
		/*
		cr.setProjection(Projections.rowCount());
		List<Long> results=cr.list();
		for(Iterator<Long> it=results.iterator(); it.hasNext();) {
		
			long st1=(Long)it.next();
			System.out.println(+st1);
		}
		*/
		
		/*
		cr.setProjection(Projections.countDistinct("sname"));
		List<Long> results=cr.list();
		for(Iterator<Long> it=results.iterator(); it.hasNext();) {
		
			long st1=(Long)it.next();
			System.out.println(+st1);
		}
		*/
		
		//cr.setProjection(Projections.avg("smarks"));
		
		//cr.setProjection(Projections.max("smarks"));
		
		//cr.setProjection(Projections.min("smarks"));
		
		cr.setProjection(Projections.sum("smarks"));
		List<Double> results=cr.list();
		for(Iterator<Double> it=results.iterator(); it.hasNext();) {
		
			double st1=(Double)it.next();
			System.out.println(+st1);
		}
		
		tx.commit();
		s.close();
		
	}

}
