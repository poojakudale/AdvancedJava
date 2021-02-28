package com.simplilearn.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil 
{
	private static final SessionFactory sessionFactory = buildSessionFactory();
	private static ServiceRegistry serviceRegistry;
	
	private static SessionFactory buildSessionFactory()
	{
		try {
			
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			
			serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
			
	
			return configuration.buildSessionFactory(serviceRegistry);
	
		}catch (Throwable e) {
			
			System.err.println("Failed to create sessionFactory objec..."+e);
		
			throw new ExceptionInInitializerError(e);
		}
		
		
	}
	
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
}
