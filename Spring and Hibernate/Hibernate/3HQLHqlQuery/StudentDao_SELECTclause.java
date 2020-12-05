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
		If you want to obtain few properties of objects instead of the complete object,
		use the SELECT clause. It is notable here that S.name is a property 
		of StudentDto object rather than a field of the STUDENT table.
		*/	
		/*
		String hql=" SELECT S.sname FROM StudentDto AS S ";
		Query query=s.createQuery(hql);
		List<String> results=query.list();
		
		for(Iterator<String> it=results.iterator(); it.hasNext(); )
		{
			String n=(String)it.next();
			System.out.println(n);
		}
		*/
		String hql=" SELECT S.sid, S.sname FROM StudentDto AS S ";
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
