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
		This clause lets Hibernate pull information from the database and group it
	    based on a value of an attribute and,typically, use the result to
		include an aggregate value.
		*/	
		
		String hql=" SELECT S.sname, SUM(S.smarks) FROM StudentDto AS S " + "GROUP BY S.sname";
		Query query=s.createQuery(hql);
		List<Object[]> results=query.list();
		
		for(Object[] o : results)
		{
			for(Object o1 : o) {
			
				System.out.print(" "+o1);
				
			}
			System.out.println(" ");
		}

		tx.commit();
		s.close();

	}

}
