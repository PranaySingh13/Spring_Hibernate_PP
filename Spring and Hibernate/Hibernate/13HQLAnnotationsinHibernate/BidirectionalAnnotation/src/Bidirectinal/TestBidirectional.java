package Bidirectinal;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class TestBidirectional {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure("Bidirectional.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		
		
		/*
		 * Train t= new Train(); t.setTrainNo(123456);
		 * t.setTrainName("Awantika Express");
		 * 
		 * 
		 * Passenger p=new Passenger(); p.setName("raksha"); p.setPassengerID(111);
		 * p.setSeatNo(57); p.setParent(t);
		 * 
		 * 
		 * Passenger p1=new Passenger(); p1.setName("Rahul"); p1.setPassengerID(222);
		 * p1.setSeatNo(58); p1.setParent(t);
		 * 
		 * 
		 * Passenger p2=new Passenger(); p2.setName("Ravi"); p2.setPassengerID(333);
		 * p2.setSeatNo(59); p2.setParent(t);
		 * 
		 * Set s=new HashSet(); s.add(p); s.add(p1); s.add(p2);
		 * 
		 * t.setPas(s);
		 * 
		 * Transaction tx=ses.beginTransaction(); ses.save(t); tx.commit();
		 * System.out.println("success"); ses.close(); sf.close();
		 */		

	}

}
