package ps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import com.fasterxml.classmate.AnnotationConfiguration;

public class Logic {

	public static void main(String[] args) {
 
		//AnnotationConfiguration c=new AnnotationConfiguration(); this is depricated.
		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
        SessionFactory sf = c.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tx=s.beginTransaction();
        
        //Insertion
        
        Product p=new Product(); 
        p.setProId(1);
        p.setProName("Pranay");
        p.setProPrice(200.00);
        
        s.save(p);
        
        tx.commit();
        s.close();
        System.out.println("Insertion Done");
        
        
        //selection
        /*
        Object o=s.get(Product.class,new Integer(1));
        Product p=(Product)o;
        System.out.println(p.getProId()+" "+p.getProName()+" "+p.getProPrice());
        
        s.close();
        
        System.out.println("Selection done");
        */
        
        //Updation
        /*
        Object o=s.get(Product.class,new Integer(1));
        Product p=(Product)o;
        p.setProName("PranayS");
        p.setProPrice(100.00);
        s.update(p);
        tx.commit();
        s.close();
        System.out.println("Updation Done");
        */
        
        //Deletion
        /*
        Object o=s.get(Product.class,new Integer(1));
        Product p=(Product)o;
        s.delete(p);
        tx.commit();
        s.close();
        System.out.println("deletion done");
        */
	}

}
