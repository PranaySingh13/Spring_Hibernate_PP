package ps;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;

public class Logic {

	public static void main(String[] args) {

		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf=c.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		String hql="From Question q";
		Query q=s.createQuery(hql);
		
		List list=q.list();
		Iterator it=list.iterator();
		
		while(it.hasNext()) {
			Object o=it.next();
			Question qs=(Question)o;
			System.out.println(qs.getQuestionId()+" "+qs.getQuestionName());
		
		Set s1 = qs.getChild();
		Iterator it1=s1.iterator();
		
		while(it1.hasNext()) {
			Object o1=it1.next();
			Answers a=(Answers)o1;
			System.out.println(a.getAnswerId()+" "+a.getAnswerName()+" "+a.getForeignId());
		}
		}
		s.close();
		System.out.println("One to Many is done for Selecting...");
		sf.close();

	}

}
