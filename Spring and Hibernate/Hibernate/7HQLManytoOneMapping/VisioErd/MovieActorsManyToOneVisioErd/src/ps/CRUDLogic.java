package ps;

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
		m1.setMovieName("Gold");
		
		Movie m2=new Movie();
		m2.setMovieId(2);
		m2.setMovieName("Kedarnath");
		
		Actors a1=new Actors();
		a1.setActorId(1);
		a1.setActorName("Akshay Kumar");
		a1.setParentObject(m1);
		
		Actors a2=new Actors();
		a2.setActorId(2);
		a2.setActorName("Mouni Roy");
		a2.setParentObject(m1);
		
		Actors a3=new Actors();
		a3.setActorId(3);
		a3.setActorName("Shushant Singh");
		a3.setParentObject(m2);
		
		Actors a4=new Actors();
		a4.setActorId(4);
		a4.setActorName("Sara khan");
		a4.setParentObject(m2);
		
		s.save(a1);
		s.save(a2);
		s.save(a3);
		s.save(a4);
	
		tx.commit();
		s.close();
		
		System.out.println("Many to One Insert is done");
		 */
		
		//Select or Retrieve operation
		//Many To One Select One Child Object With Parent
		/*
		Object o=s.get(Actors.class,new Integer(1));
		Actors a=(Actors)o;
		System.out.println(a.getActorId()+" "+a.getActorName());
		
		Movie m=a.getParentObject();
		System.out.println(m.getMovieId()+" "+m.getMovieName());
		
		s.close();
		
		System.out.println("Many To One Mapping Single child with parent selecting is done...");
		*/
		
		//Many To One Select All Child Object With Parent
		/*
		Query q=s.createQuery("from Actors a");
		List list=q.list();
		Iterator it=list.iterator();
		
		while(it.hasNext()) {
			
			Object o=it.next();
			Actors a1=(Actors)o;
			System.out.println(a1.getActorId()+" "+a1.getActorName());
			Movie m=a1.getParentObject();
			System.out.println(m.getMovieId()+" "+m.getMovieName());
		}
		s.close();
		System.out.println("Many To One Mapping Selecting all child with parent is done...");
		*/
		
		//Update operation
		//Update Operation on Parent
		/*
		Object o1=s.get(Movie.class, new Integer(1));
		Movie m=(Movie)o1;
		m.setMovieName("Airlift");
		s.update(m);
		
		//Update Operation on child
		Object o2=s.get(Actors.class, new Integer(2));
		Actors a=(Actors)o2;
		a.setActorName("Nimrat Kaur");
		s.update(a);
		
		tx.commit();
		s.close();
		
		System.out.println("Many to One Mapping Updating is done...");
		*/
		
		//Delete Operation
		//Deleting Single Parent Object With All Child
		
		Object o=s.get(Actors.class, new Integer(1)); //single child object will not delete until we set Vdummy=null beacuse parent has multiple childs and thats why parent will not delete automatically.
		Actors a=(Actors)o;
		a.setParentObject(null); //to remove exception and delete the record
		s.delete(a);
		
		tx.commit();
		s.close();
		
		System.out.println("Many to one mapping deleting single parent all child done...");
		
		//Deleting All Parent Object With All Child
		/*
		Object o=s.get(Movie.class, new Integer(2)); //parent object having multiple child will not delete automatically.
		Movie m=(Movie)o;
		s.delete(m);
		
		tx.commit();
		s.close();
		
		System.out.println("Many to one mapping deleting all parent all child done...");
		 */
		
	}

}
