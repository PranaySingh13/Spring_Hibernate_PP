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

public class BusinessLogic {

	public static void main(String[] args) {

		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf=c.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		/*
		Address ad=new Address();
		ad.setIdAddress(1);
		ad.setLine1("dharKothi");
		ad.setLine2("myroad");
		ad.setCountry("india");
		ad.setState("M.P.");
		ad.setPin(452001);
		ad.setDistrict("indore");
		
		company co=new company();
		co.setName("Abc");
		co.setInitials("@abc");
		co.setEmail("abc@gmail.com");
		co.setContact(2457891);
		
		co.setAdd(ad);
		
		role ro=new role();
		
		ro.setIdrole(1);
		ro.setName("PranaySingh");
		ro.setName_short("ps");
		
		Set s1=new HashSet();
		s1.add(ro);
		
		co.setRoles(s1);
		s.save(co);
		*/
		
		/*user u=new user();
		u.setIdUser(1);
		
		Set s2=new HashSet();
		s2.add(u);
		
		Object o=s.get(role.class,new Integer(1));
		role ro=(role)o;
		
		ro.setUser(s2);
		*/
		
		/*role ro1=new role();
		
		ro1.setIdrole(3);
		ro1.setName("Pranay");
		ro1.setName_short("ps1");
		
		Object o1=s.get(role.class,new Integer(1));
		role ro2=(role)o1;
		
		Set s3=new HashSet();
		s3.add(ro1);
		s3.add(ro2);
		
		Object o=s.get(company.class,new Integer(1));
		company co1=(company)o;
		
		co1.setRoles(s3);
		
		s.save(co1);*/
		
		Object o1=s.get(Address.class,new Integer(1));
		Address ad1=(Address)o1;
		
		region region = new region();
		region.setAdd(ad1);
		
		Object o=s.get(company.class,new Integer(1));
		company co1=(company)o;
		
		Set s4 = new HashSet();
		s4.add(region);
		
		co1.setRegion(s4);
		
		s.save(co1);
		
		
		
		tx.commit();
		s.close();
		sf.close();
		System.out.println("table created");
		
	}

}
