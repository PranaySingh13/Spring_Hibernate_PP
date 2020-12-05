package sixthhb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;

public class ForOurLogic { 

	public static void main(String[] args)
	{

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session1 = factory.openSession();
		
		Object o=session1.load(Product.class,new Integer(1));

		Product s=(Product)o;
		System.out.println("Loaded object product name is___"+s.getProName());
		System.out.println("Object Loaded successfully.....!!");
		session1.close();

		System.out.println("------------------------------");
		System.out.println("Waiting......");

		try{
			Thread.sleep(6000);
		}
		catch (Exception e) {
		}		

		System.out.println("6 seconds compelted......!!!!!!!!");

		
		Session session2 = factory.openSession();
		Transaction tx=session2.beginTransaction();
		//Query q=session2.createQuery("UPDATE Product set proName ='cards' WHERE productId= 1"); //it works.
		
		//String hql="UPDATE Product p set p.proName = ? WHERE p.productId=1"; //it works.
		
		String hql="UPDATE Product set proName = :pname" + " WHERE productId= :pid"; //standard way for update method.
		
		Query q=session2.createQuery(hql);
		q.setParameter("pid", 1);
		q.setParameter("pname", "toy");
		int r=q.executeUpdate();
		System.out.println("Records updated: "+r);
		tx.commit();
		
		Object o2=session2.load(Product.class,new Integer(1));

		Product s2=(Product)o2;
		System.out.println("Loaded object product name is___"+s2.getProName());
		System.out.println("Object loaded from the database...!!");
		session2.close();

		Session session3 = factory.openSession();
		Object o3=session3.load(Product.class,new Integer(1));

		Product s3=(Product)o3;
		System.out.println("Loaded object product name is___"+s3.getProName());
		System.out.println("Object loaded from global cache successfully.....!!");
		session3.close();

		factory.close();
	}

}
