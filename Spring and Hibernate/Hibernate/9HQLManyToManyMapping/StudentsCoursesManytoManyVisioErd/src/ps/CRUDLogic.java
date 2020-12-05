package ps;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CRUDLogic {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
		Transaction tx = session.beginTransaction();
		
		//Create Operation
		/*		
		Students s1=new Students();
		s1.setStudentId(1);
		s1.setStudentName("Pranay");
		s1.setMarks(100);

		Students s2=new Students();
		s2.setStudentId(2);
		s2.setStudentName("Apoorva");
		s2.setMarks(200);

		Courses c1=new Courses();
		c1.setCourseId(1);
		c1.setCourseName("Hibernate");
		c1.setDuration(10);

		Courses c2=new Courses();
		c2.setCourseId(2);
		c2.setCourseName("Java");
		c2.setDuration(30);

		Set s =new HashSet();
		      s.add(c1);
		      s.add(c2);

		s1.setCourses(s);
		s2.setCourses(s);

		    

		                      session.save(s1);
		                      session.save(s2);

		    tx.commit();

		    session.close();
		    System.out.println("Many To Many Bi-Directional is Done..!!");
		    factory.close();
		 	*/
		
		//Select Operation
		
		//Selecting single parent with all child
			/*
				Object o=session.get(Students.class, new Integer(1));
				Students s=(Students)o;
				
				System.out.println(s.getStudentId()+" "+s.getStudentName()+" "+s.getMarks());
				
				Set s1=s.getCourses();
				Iterator it=s1.iterator();
				
				while(it.hasNext()) {
					
					Object o1=it.next();
					Courses c1=(Courses)o1;
					System.out.println(c1.getCourseId()+" "+c1.getCourseName()+" "+c1.getDuration());
				}
				session.close();
				System.out.println("Many to Many Mapping Single Parent Selecting All child done...");
				*/
		
		//Update Operation
		
		//Updating Single Parent with all child
		/*
		Object o=session.get(Students.class, new Integer(2));
		Students s=(Students)o;
		s.setMarks(300);
		session.update(s);
		tx.commit();
		session.close();
		System.out.println("Many to Many Updating is done ");
		*/
		
		//Delete Operation
		
		//Delete Single parent with all child
		
		Object o=session.get(Students.class, new Integer(2));
		Students s=(Students)o;
		s.setCourses(null);/*it is set to be null to free the foreignId column because in many to many
		 					mapping if we delete single parent then automatically its childs get deleted
		 					and childs which are associated with other parent will also automatically.*/
		session.delete(s);
		tx.commit();
		session.close();
		System.out.println("Many to Many Deleting is done");
		
	
	}

}
