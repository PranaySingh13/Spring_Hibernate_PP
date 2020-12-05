package ps;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Filter;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import ps.Student;

public class FilterLogic {

	public static void main(String[] args) {

		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx=s.beginTransaction();
		
		System.out.println("Student Name Filter");
        System.out.println("-------------------");
        
        // enabling the studentName filter
        s.enableFilter("studentName");
        Query query = s.createQuery("from Student s");
        List list = query.list();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Student student = (Student) it.next();
            System.out.println("Student Names which starting with 'c' : " + student.getStudentName());
        }
        
        // disabling the studentName filter after the operation
        s.disableFilter("studentName");
        System.out.println("Age Filter");
        System.out.println("-------------------");
        
        // enabling the age filter
        Filter filter = s.enableFilter("ageFilter");
        filter.setParameter("age", 20);
        Query query2 = s.createQuery("from Student s");
        List list2 = query2.list();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Student student = (Student) it2.next();
            System.out.println("studentNames who are age >= 20 : " + student.getStudentName());
        }
        
        // disabling the age filter after the operation
        s.disableFilter("ageFilter");
        
        s.clear();
        s.close();
	}

}
