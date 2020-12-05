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
		The Query interface now contains a method called executeUpdate for executing HQL UPDATE or
		DELETE statements. The UPDATE clause can be used to update one or more properties of an 
		one or more objects.
		*/	
		/*
		Query q=session2.createQuery("UPDATE Product set proName ='cards' WHERE productId= 1"); //it works.
		
		String hql="UPDATE Product p set p.proName = ? WHERE p.productId=1"; //it works.
		
		String hql="UPDATE Product set proName = :pname" + " WHERE productId= :pid"; //standard way for update method.
		*/

		String hql=" UPDATE StudentDto AS S set S.smarks= :stud_marks WHERE S.sid= :stud_id";
		Query query=s.createQuery(hql);
		query.setParameter("stud_marks", 600.00);
		query.setParameter("stud_id", 6);
		int result=query.executeUpdate();
		System.out.println("Records Updated: "+result);
		
		
		tx.commit();
		s.close();

	}

}
