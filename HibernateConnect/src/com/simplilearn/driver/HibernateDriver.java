package com.simplilearn.driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.simplilearn.model.EmployeeInfo;
import com.simplilearn.utility.HibernateUtil;

public class HibernateDriver {

	public static void main(String[] args) 
	{
			EmployeeInfo employee = new EmployeeInfo();
			
			employee.setName("Priyanka");
			employee.setRoll_no(112);
			
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			
			Session session = sessionFactory.openSession();
			
			session.beginTransaction();
			
			session.save(employee);
			
			session.getTransaction().commit();
			session.close();
			sessionFactory.close();
	}

}
