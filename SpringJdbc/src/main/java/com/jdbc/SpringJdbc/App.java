package com.jdbc.SpringJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
        
        EmployeeDAO dao=(EmployeeDAO)ctx.getBean("edao");  
        /* 
       int status=dao.saveEmployee(new Employee(103,"Pooja",35000));  
        System.out.println(status);  
            
        int status=dao.updateEmployee(new Employee(103,"Puja",15000)); 
        System.out.println(status); 
       */
             
        Employee e=new Employee(); 
        e.setId(103); 
        int status=dao.deleteEmployee(e); 
        System.out.println(status);  
          
    }  
      

}
