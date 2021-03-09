package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//Aspect
@Aspect
public class TrackOperation
{
/*	
	//@Before("execution(public void msg())")
	@After("pointcut()")  //after pointcut 
	public void myadvice(JoinPoint jp)  //advise (after advice)
	{
		System.out.println("Cross-Cutting Concerns...");
		System.out.println(jp.getSignature());
	}
	
	// (..) : zero or any number of arguments
	// * : wildcard - o or any number of characters
	
	//@After("execution(public void m*())")
	//@Before("execution(public void *())")
	@Before("pointcut()") // before pointcut
	public void advice()  //advice (before advice)
	{
		System.out.println("Additional Concerns...");
	}
	
	//@Pointcut("execution( * *())")
	@Pointcut("execution( * *(..))")
	public void pointcut()
	{}
	
	*/
	
	
	/*
	 
	 	//AfterReturning
	
	@AfterReturning(
				pointcut="execution(* Operation.*(..))",
				returning ="result"
			)
	public void advice1(JoinPoint jp, Object result)
	{
		System.out.println("Concern Demo");
		System.out.println("Method Signature : "+jp.getArgs());
		System.out.println("Result in advice : "+result);
		System.out.println("End of after returning advice.....");
		
	}
	
	 */

	// Around demo
	
	@Pointcut("execution( * *(..))")
	public void pointcut()
	{}
	
	@Around("pointcut()")
	public Object myadvice(ProceedingJoinPoint pjp) throws Throwable
	{
		System.out.println("Concerns calling before actual methods");
		Object obj = pjp.proceed();
		System.out.println("Concerns calling after actual methods");
		
		
		return obj;
	}
	
}
