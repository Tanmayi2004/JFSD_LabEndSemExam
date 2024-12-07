package com.klef.jfsd.exam;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class insert {

	    public static void main(String[] args) {
	        Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");

	        SessionFactory sf = cfg.buildSessionFactory();
	        Session s = sf.openSession();

	        Transaction t = (Transaction) s.beginTransaction();

	        // Create and save Department
	        Department dept = new Department();
	        dept.setDepartmentId(111);
	        dept.setName("Tanu");
	        dept.setLocation("s block");
	        dept.setHodName("Dr. Smith");
	        s.save(dept);

	        // Create and save Employee with reference to Department
	      
	       
	        System.out.println("Records Inserted");
	        s.close();
	    }
	}
