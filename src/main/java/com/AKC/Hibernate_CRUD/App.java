package com.AKC.Hibernate_CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {
			System.out.println("Hello Hibernate!");

			Configuration cfg = new Configuration();

			cfg.configure();

			SessionFactory sf = cfg.buildSessionFactory();
			Session s = sf.openSession();

			Transaction txn = s.beginTransaction();

			Student sd = new Student();
			sd.setSid(5);
			sd.setSname("ABc");
			sd.setEmailid("aBc@gmial.com");
			sd.setFee(11000);
			System.out.println("Data Inserted");
			s.save(sd);
			txn.commit();

			// Retrieve the data
			Student sd1 = s.find(Student.class, 1);
			System.out.println(sd1);
			System.out.println("Data Retrieved");

			// update
			Student sd2 = s.find(Student.class, 4);
			sd2.setSname("SEC32");
			s.merge(sd2);
			Transaction tnx1 = s.beginTransaction();
			tnx1.commit();
			System.out.println("Data Updated");

			// delete
			Student sd3 = s.find(Student.class, 2);
			s.remove(sd3);
			Transaction tnx2 = s.beginTransaction();
			tnx2.commit();
			System.out.println("Data Deleted");

		} catch (Exception e) {
			// e.printStackTrace();
			// System.out.println("Error");
		}
	}
}