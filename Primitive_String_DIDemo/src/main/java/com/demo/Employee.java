package com.demo;


//Pojo Class

public class Employee 
{
	private int eid;
	private String name;
	
	public Employee()
	{
		System.out.println("Default Constructor");
	}
	public Employee(int eid)
	{
		this.eid = eid;
	}
	public Employee(String name)
	{
		this.name = name;
	
	}
	public Employee(int eid,String name)
	{
		this.eid = eid;
		this.name = name;
	
	}
	
	void show()
	{
		System.out.println("id : "+eid+"\n name : "+name);
	}


	//bean lifecycle methods
public void init()
{
	System.out.println("Init method invoked");
}

public void destroy()
{
	System.out.println("destroy method invoked");
	
}


}
