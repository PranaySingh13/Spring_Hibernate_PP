package ps;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CRUDLogic {

	public static void main(String[] args) {

		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf=c.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		
		//Create or Insert Operation
		
		Movie m1=new Movie();
		m1.setMovieId(1);
		m1.setMovieName("Padmaavat");
		
		Movie m2=new Movie();
		m2.setMovieId(2);
		m2.setMovieName("Jodha Akbar");
		
		Actors a1=new Actors();
		a1.setActorId(1);
		a1.setActorName("Ranveer Singh");
		
		Actors a2=new Actors();
		a2.setActorId(2);
		a2.setActorName("Deepika Padukone");
		
		Actors a3=new Actors();
		a3.setActorId(3);
		a3.setActorName("Hrithik Roshan");
		
		Actors a4=new Actors();
		a4.setActorId(4);
		a4.setActorName("Aishwarya Rai");
		
		Set s1=new HashSet();
		s1.add(a1);
		s1.add(a2);
		
		Set s2=new HashSet();
		s2.add(a3);
		s2.add(a4);
		
		m1.setChildObject(s1);
		m2.setChildObject(s2);
		
		s.save(m1);
		s.save(m2);
		tx.commit();
		s.close();
		System.out.println("One to Many Mapping Insert Done");
		 
		
		
		//Select or Retrieve Operation
		
		//Selecting single parent with all child
		/*
		Object o=s.get(Movie.class, new Integer(1));
		Movie m1=(Movie)o;
		
		System.out.println(m1.getMovieId()+" "+m1.getMovieName());
		
		Set s1=m1.getChildObject();
		Iterator it=s1.iterator();
		
		while(it.hasNext()) {
			
			Object o1=it.next();
			Actors a=(Actors)o1;
			System.out.println(a.getActorId()+" "+a.getActorName());
		}
		s.close();
		System.out.println("One to Many Mapping Single Parent Selecting All child done...");
		*/
		
		//Selecting All parent with all child
		/*
		Query q=s.createQuery("from Movie m");
		List list=q.list();
		Iterator it=list.iterator();
		
		while(it.hasNext()) {
			
			Object o=it.next();
			Movie m1=(Movie)o;
			System.out.println(m1.getMovieId()+""+m1.getMovieName());
			
			
			Set s1=m1.getChildObject();
			Iterator it1=s1.iterator();
			
			while(it1.hasNext()) {
			Object o1=it1.next();
			Actors a=(Actors)o1;
			System.out.println(a.getActorId()+" "+a.getActorName()+" "+a.getForeignId());
			}
			
		}		
		s.close();
		System.out.println("One to Many Mapping All Parent Selecting Done...");
		*/
		
		//Update Operation
		//Update Operation on parent
		/*
		Object o1=s.get(Movie.class,new Integer(2));
		Movie m1=(Movie)o1;
		m1.setMovieName("Dhoom");
		s.update(m1);
		
		//Update Operation on child
		Object o2=s.get(Actors.class,new Integer(3));
		Actors a1=(Actors)o2;
		a1.setActorName("Abhishek Bachhan");
		s.update(a1);
		
		tx.commit();
		s.close();
		
		System.out.println("One to Many Mapping Updating is done...");
		*/
		
		//Delete Operation
		//Deleting Single Parent Object With All Child
		/*
		Object o=s.get(Movie.class, new Integer(2));
		Movie m=(Movie)o;
		s.delete(m);
		
		tx.commit();
		s.close();
		
		System.out.println("One to Many Mapping Single parent deleting with all coresponding childs done...");
		*/
		
		//Deleting All Parent Object With All Child
		/*
		Query q=s.createQuery("from Movie m");
		List list=q.list();
		Iterator it=list.iterator();
		
		while(it.hasNext()) {
			
			Object o=it.next();
			Movie m1=(Movie)o;
			s.delete(m1);
		}
		tx.commit();
		s.close();
		
		System.out.println("One to Many Mapping Deleting all parent with all corresponding child is done...");
		*/
	}

}
