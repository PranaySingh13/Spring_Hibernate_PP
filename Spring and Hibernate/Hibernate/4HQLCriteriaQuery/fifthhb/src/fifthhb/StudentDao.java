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
		
		/*
		The Hibernate Session interface provides createCriteria method, which
		can be used to create a Criteria object that returns instances of the
		persistence object's class when your application executes a criteria query.
		 */
		
		Criteria cr=s.createCriteria(StudentDto.class);
		
		//Restriction with Criteria.
		
		//cr.add(Restrictions.eq("smarks", 100.00));
		
		//cr.add(Restrictions.gt("smarks", 100.00)); //we have to give 100.00 because as smarks has double datatype.
		
		//cr.add(Restrictions.lt("smarks", 100.00));
		
		//cr.add(Restrictions.between("smarks", 100.00,800.00));
		
		//cr.add(Restrictions.isNotNull("smarks"));
		
		//cr.add(Restrictions.isNull("smarks"));
		
		//cr.add(Restrictions.isEmpty("smarks"));
		
		//cr.add(Restrictions.isNotEmpty("smarks"));
		
		//cr.add(Restrictions.ilike("sname","Apoorva"));
		
		//cr.add(Restrictions.like("sname","Apoorva"));
		
		/*
		Criterion marks=Restrictions.gt("smarks",90.00);
		Criterion name=Restrictions.ilike("sname", "Apoorva");
		
		
		// To get records matching with AND conditions
		LogicalExpression andExp=Restrictions.and(marks, name);
		cr.add(andExp);
		
		
		// To get records matching with OR conditions
		LogicalExpression orExp=Restrictions.or(marks, name);
		cr.add(orExp);
		*/
		
		
		List<?> results=cr.list();
		for(Iterator<?> it=results.iterator(); it.hasNext();) {
		
			StudentDto st1=(StudentDto)it.next();
			System.out.println(+st1.getSid()+" "+st1.getSname());
		}
		
		tx.commit();
		s.close();
		
	}

}
