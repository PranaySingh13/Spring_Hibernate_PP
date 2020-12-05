package ps;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RetrieveLogic {

	public static void main(String[] args) {
		
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx=s.beginTransaction();
		
		//Many To One Select One Child Object With Parent.
		/*Object o1=s.get(Cities.class,new Integer(1));
		Cities c1=(Cities)o1;
		State s1=c1.getParentObject();
		
		System.out.println(c1.getCityId()+" "+c1.getCityName());
		System.out.println(s1.getStateId()+" "+s1.getStateName());
		*/
		
		//Many To One Select All Child Object With Parent
		Query q=s.createQuery("from Cities ct");
		List list=q.list();
		Iterator it=list.iterator();
		
		while(it.hasNext()) {
			
			Object o=it.next();
			Cities c1=(Cities)o;
			System.out.println(c1.getCityId()+" "+c1.getCityName());
			State s1=c1.getParentObject();
			System.out.println(s1.getStateId()+" "+s1.getStateName());
		}
		s.close();
		System.out.println("Many to one selecting is done.....");
	}
}
