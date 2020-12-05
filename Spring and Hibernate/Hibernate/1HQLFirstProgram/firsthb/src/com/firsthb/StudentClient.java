package com.firsthb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class StudentClient
{
  public static void main(String[] args) throws Exception
  {                                           // create Configuration class
                                              // Configuration object parses and reads .cfg.xml file
    Configuration c = new Configuration();
    c.configure("/hibernate.cfg.xml");
                                             // SessionFactory holds cfg file properties like
                                             // driver props and hibernate props and mapping file
    SessionFactory sf=c.buildSessionFactory();
                                            // create one session means Connection
    Session s = sf.openSession();
                                            // before starting save(),update(), delete() operation we need to start TX
                                            // starting tx mean    con.setAutoCommit(false);
    Transaction tx = s.beginTransaction();
 
    try
    {
      Student std1=new Student();
      std1.setSid(1);
      std1.setSname("Pranay");
      std1.setSmarks(100);
 
      Student std2=new Student();
      std2.setSid(2);  
      std2.setSname("Apoorva");
      std2.setSmarks(90);
 
      Student std3=new Student();
      std3.setSid(3);
      std3.setSname("kailash");
      std3.setSmarks(300);
 
      Student std4=new Student();
      std4.setSid(4);  
      std4.setSname("Gayatri");
      std4.setSmarks(400);
      
      s.save(std1);                              // stmt.addBatch("INSERT INTO school VALUES (....)");
      s.save(std2);
      s.save(std3);
      s.save(std4);
 
      s.flush(); // stmt.executeBatch()
      tx.commit(); // con.commit();
      System.out.println("Records inserted");
    }
    catch(Exception e)
    {
      tx.rollback();                            // con.rollback();
    }
  }
}