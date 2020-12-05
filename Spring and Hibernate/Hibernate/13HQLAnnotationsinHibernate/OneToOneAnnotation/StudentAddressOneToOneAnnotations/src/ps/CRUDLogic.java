package ps;

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
		Transaction tx=session.beginTransaction();
		
		//Create or Insert Operation
		
		Student s=new Student();
		s.setStudentId(1);
		s.setStudentName("Kailash");

		Address ad = new Address();
		ad.setAddressId(6); 
		ad.setCity("Indore");
		ad.setState("M.P.");
		ad.setS(s);		

		session.save(ad);

		tx.commit();

		session.close();
		System.out.println("One to One Insert is Done..!!");
		factory.close();
		
		
		//Select Operation
		/*
		Object o=session.get(Student.class, new Integer(1));
		Student s=(Student)o;
		System.out.println(s.getStudentId()+" "+s.getStudentName());
		
		Object o1=session.get(Address.class,new Integer(1));
		Address a=(Address)o1;
		System.out.println(a.getAddressId()+" "+a.getCity()+" "+a.getState());
		
		session.close();
		System.out.println("One to One Selecting Done");
		*/
		
		//Update operation
		/*
		Object o1=session.get(Address.class,new Integer(1));
		Address a=(Address)o1;
		a.setCity("Ujjain");
		session.update(a);
		
		tx.commit();
		session.close();
		
		System.out.println("One to One Mapping Updating is done");
		*/
		
		//Delete Operation
		/*
		Object o=session.get(Student.class, new Integer(1));
		Student s=(Student)o;
		session.delete(s);//Here we can see that on deleting parent class associated table, child class associated table does not delete automatically. 
		tx.commit();
		session.close();
		
		System.out.println("One to One Mapping Deleting is done");
		*/
	}

}
