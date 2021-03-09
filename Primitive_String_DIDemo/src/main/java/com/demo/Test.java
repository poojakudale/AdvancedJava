package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) 
	{
	/*
		//BeanFactory Container it's a type of IOC container
		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		*/
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//lazy loading
		Employee s =(Employee) context.getBean("e"); // it instantiate bean factory container
		
		s.show();
		
		//to destroy bean i.e. it call destroy() method from bean class
		context.registerShutdownHook();
			}

}
