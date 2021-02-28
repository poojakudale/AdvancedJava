package com.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil 
{
	private static SessionFactory sessionFactory = buildSessionFactory();
	private static ServiceRegistry serviceRegistry;
	
	private static SessionFactory buildSessionFactory()
	{
		try {
			
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			System.out.println("Hibernate configuration loaded");
			
			serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			
			System.out.println("Hibernate Service registry created");
			
			
			return configuration.buildSessionFactory(serviceRegistry);
	
		}catch (Throwable e) {
			
			System.err.println("Failed to create sessionFactory objec..."+e);
		
			throw new ExceptionInInitializerError(e);
		}
		
		
	}
	
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactory == null)
			{sessionFactory = buildSessionFactory();}
		
		return sessionFactory;
	}
}
