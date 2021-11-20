package com.bean;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class ApplicationClass {

	public static void main(String[] args) 
	{
		try
		{
			Session s = new AnnotationConfiguration().configure().buildSessionFactory().openSession();
			
			Transaction t = s.beginTransaction();
			
			Employee e = new Employee();
			
			e.setName("Akshay");
			e.setDesignation("Jr Software Engineer");
			e.setSalary(900000);
			
			int i = (int)s.save(e);
			t.commit();
			
			if(i>0)
				System.out.println("Inserted");
			else
				System.out.println("Try again");
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
