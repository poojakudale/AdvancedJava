package com.hibernate.main;



import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.model.*;
import com.hibernate.util.HibernateUtil;



public class HQLExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		Transaction tr = session.beginTransaction();
		
		Query query = session.createQuery("From Employee");
		
		List<Employee> list = query.list();
		
		for(Employee emp : list)
		{
			System.out.println("List of Employees : "+emp.getId()+" "+emp.getAddress().getCity());
			
		}
		
		//HQL - get Employee with id
		
		query = session.createQuery("from Employee where id = :id");
		query.setInteger("id", 101);
		Employee emp =(Employee) query.uniqueResult();
		
		System.out.println("Name is : "+emp.getName()+" , id is : "+emp.getId());
		
		//HQL - pagination example
		
		query = session.createQuery("From Employee");
		query.setFirstResult(0);
		query.setFetchSize(2);
		list = query.list();
		
		for(Employee emp1 : list)
		{
			System.out.println("List of Pagination Employees : "+emp1.getId()+" "+
					emp1.getName()+
					" "+emp1.getAddress().getCity());
			
		}
	/*	
		// HQL - Update Employee
		
		query = session.createQuery("update Employee set name = :name where id = :id");
		query.setParameter("name", "Priya Kumari");
		query.setInteger("id", 120);
		
		int result = query.executeUpdate();
		System.out.println("Update status is : "+result);
		*/
		/*
		//HQL - Delete Employee
		
		query = session.createQuery("delete Address where id = :id");
		query.setInteger("id", 120);
		int result = query.executeUpdate();
		System.out.println("Address Delete status is : "+result);
		
		query = session.createQuery("delete Employee where id = :id");
		query.setInteger("id", 120);
		int res = query.executeUpdate();
		System.out.println("Address Delete status is : "+res);
		
		*/
		/*
		//HQL - Join
		
		query = session.createQuery("select e.name, a.city from Employee e "+"INNER JOIN e.address a");
		
		List<Object[]> ls = query.list();
		for(Object[] ob : ls)
		{
				System.out.println(Arrays.toString(ob));
			
		}
		*/
		//HQL - Group By 
		
query = session.createQuery("select e.name, sum(e.salary),count(e)  "
						+"from Employee e where e.name like '%i%' group by e.name");
		
		List<Object[]> ls = query.list();
		for(Object[] ob : ls)
		{
				System.out.println(Arrays.toString(ob));
			
		}
		
		// HQL - Order by
		
		query = session.createQuery("from Employee e order by e.id desc");
		list = query.list();
		System.out.println("Order By Query");
		for(Employee emp11 : list)
		{
			System.out.println(+emp11.getId()+" "+emp11.getAddress().getCity());
			
		}
		tr.rollback();
		
		sessionFactory.close();
	}

}
