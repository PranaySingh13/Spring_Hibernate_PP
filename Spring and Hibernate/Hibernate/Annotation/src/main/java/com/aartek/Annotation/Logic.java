package com.aartek.Annotation;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic {

	public static void main(String[] args) {

		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Students s1 = new Students();
		s1.setStudentId(1);
		s1.setStudentName("Pranay");
		s1.setMarks(100);

		Students s2 = new Students();
		s2.setStudentId(2);
		s2.setStudentName("Apoorva");
		s2.setMarks(200);

		Courses c1 = new Courses();
		c1.setCourseId(1);
		c1.setCourseName("Hibernate");
		c1.setDuration(10);

		Courses c2 = new Courses();
		c2.setCourseId(2);
		c2.setCourseName("Java");
		c2.setDuration(30);

		Set s = new HashSet();
		s.add(s1);
		s.add(s2);

		c1.setStudents(s);
		c2.setStudents(s);

		session.save(c1);
		session.save(c2);

		tx.commit();

		session.close();
		System.out.println("Many To Many Bi-Directional is Done..!!");
	}

}
