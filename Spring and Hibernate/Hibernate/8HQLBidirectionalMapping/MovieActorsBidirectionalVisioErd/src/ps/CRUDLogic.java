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
		/*		
		Movie m1=new Movie();
		m1.setMovieId(1);
		m1.setMovieName("Fast n Furious");
		
		Actors a1=new Actors();
		a1.setActorId(1);
		a1.setActorName("Paul Walker");
		
		Actors a2=new Actors();
		a2.setActorId(2);
		a2.setActorName("Vin Diesel");
		
		//one to many
		
		Set s1=new HashSet();
		s1.add(a1);
		s1.add(a2);
		
		m1.setChildObject(s1);
		
		//many to one 
		
		a1.setParentObject(m1);
		a2.setParentObject(m1);
		
		s.save(a1);
		//or
		//s.save(a2);
		//or
		//s.save(m1);
		
		tx.commit();
		s.close();
		
		System.out.println("Bidirectional Mapping Insertion is done...");
		*/
		
		
		//Select or Retrieve Operation
		//one to many 
		/*
		Object o=s.get(Movie.class, new Integer(1));
		Movie m1=(Movie)o;
		
		System.out.println(m1.getMovieId()+" "+m1.getMovieName());
		
		Set s1=m1.getChildObject();
		Iterator it=s1.iterator();
		
		while(it.hasNext()) {
			
			Object o1=it.next();
			Actors a=(Actors)o1;
			System.out.println(a.getActorId()+" "+a.getActorName()+" "+a.getForeignId());
		}
		s.close();
		System.out.println("One to Many Mapping Single Parent Selecting All child done...");
		*/
		
		//Many to one
		/*		
		Object o=s.get(Actors.class,new Integer(1));
		Actors a=(Actors)o;
		System.out.println(a.getActorId()+" "+a.getActorName());
		
		Movie m=a.getParentObject();
		System.out.println(m.getMovieId()+" "+m.getMovieName());
		
		s.close();
		
		System.out.println("Many To One Mapping Single child with parent selecting is done...");
		*/
		
		
		//Update Operation
		
		//One to Many
		//Update Operation on Parent
		/*
		Object o1=s.get(Movie.class,new Integer(1));
		Movie m1=(Movie)o1;
		m1.setMovieName("FastFive");
		s.update(m1);
		
		//Update Operation on child
		Object o2=s.get(Actors.class,new Integer(2));
		Actors a1=(Actors)o2;
		a1.setActorName("Dwayne Johnson");
		s.update(a1);
		
		tx.commit();
		s.close();
		
		System.out.println("One to Many Mapping Updating is done...");
		*/
		
		
		//Many to One
		//Update Operation on Parent
				/*
				Object o1=s.get(Movie.class, new Integer(1));
				Movie m=(Movie)o1;
				m.setMovieName("FastNFurious");
				s.update(m);
				
				//Update Operation on child
				Object o2=s.get(Actors.class, new Integer(2));
				Actors a=(Actors)o2;
				a.setActorName("Vin Diesel");
				s.update(a);
				
				tx.commit();
				s.close();
				
				System.out.println("Many to One Mapping Updating is done...");
				*/
		
		//Delete Operation
				//one to many
		//Deleting Single Parent Object With All Child
				/*
				Object o=s.get(Movie.class, new Integer(1));
				Movie m=(Movie)o;
				s.delete(m);
				
				tx.commit();
				s.close();
				
				System.out.println("One to Many Mapping Single parent deleting with all coresponding childs done...");
				*/
		
			//many to one
		//Deleting Single Parent Object With All Child
				
				Object o=s.get(Actors.class, new Integer(1)); //single child object will not delete until we set Vdummy=null beacuse parent has multiple childs and thats why parent will not delete automatically.
				Actors a=(Actors)o;
				a.setParentObject(null); //to remove exception and delete the record
				s.delete(a);
				
				tx.commit();
				s.close();
				
				System.out.println("Many to one mapping deleting single parent all child done...");
				
	}

}
