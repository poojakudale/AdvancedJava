package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		Operation o =(Operation) context.getBean("opBean");

		Greetings gr =(Greetings) context.getBean("greetBean");
		
		//joinpoint (before)
		o.msg();
		//joinpoint (after)
		
		//joinpoint (befor)
		System.out.println(o.m());
		//joinpoint (after)
	
		//joinpoint (before)
		System.out.println(o.k());
		//joinpoint (after)

		//joinpoint (before)
		gr.msg(4);
		//joinpoint (after)
	}

}
