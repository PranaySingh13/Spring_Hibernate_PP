package com.secondhb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GetLOadDeleteUpdate {

	public static void main(String[] args) throws Exception {
		
		 Configuration c = new Configuration();
		    c.configure("/hibernate.cfg.xml");
		    SessionFactory sf = c.buildSessionFactory();
		    Session s = sf.openSession();	    // Transaction object is not required for fetching 
	
		                        // SINGLE RECORD EAGER FETCH WITH Session.get()	
		    Object obj = s.get(Student.class, new Integer(1));
		    if(obj != null) 
		    {
		      System.out.println(obj.getClass().getName());  // prints Student
		      Student s1 = (Student) obj;
		 
		      System.out.println(s1.getSid());
		      System.out.println(s1.getSname());
		      System.out.println(s1.getSmarks());
		    } 
		    else 
		    {
		      System.out.println("Record does not exist");
		    } 
		    
		    // SINGLE RECORD LAZY FETCH WITH Session.load() where record exists
		    
		    Object obj1 = s.load(Student.class, new Integer(2));  
		    Student s2 = (Student) obj1;
		    System.out.println(obj1.getClass().getName());
		                                           // prints Student$$EnhancerByCGLIB$$ba69672d
		    System.out.println(s2.getSid());
		    System.out.println(s2.getSname());
		    System.out.println(s2.getSmarks());
		  
		                         // SINGLE RECORD LAZY FETCH WITH Session.load() where record DOES NOT exist

		    	// DELETE OPERATION
            // Transaction object is required for all operations except fetching records
		    Transaction tx = s.beginTransaction();  
		    Object obj2 = s.load(Student.class, new Integer(2));           // 2 record exists
		    Student s3 = (Student)obj2;

		    s.delete(s3);
		    tx.commit();                           // commit() implicitly calls flush()
		    System.out.println("2nd record is deleted");
		    
		    	// UPDATE OPERATION
		    Transaction tx1 = s.beginTransaction();           
		    Object obj3 = s.load(Student.class, new Integer(1));  	// 1 record exists
		    Student s4 = (Student)obj3;

		    s4.setSname("PranaySingh");
		    s4.setSmarks(200);
		    s.update(s4);
			tx1.commit();  
			System.out.println("1st record is updated");
	}

}
