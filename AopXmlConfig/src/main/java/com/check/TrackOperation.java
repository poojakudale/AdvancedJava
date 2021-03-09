package com.check;

import org.aspectj.lang.JoinPoint;


public class TrackOperation
{
	public void myadvice(JoinPoint jp)  //advise (after advice)
	{
		System.out.println("Cross-Cutting Concerns...");
		System.out.println(jp.getSignature());
	}
	
	
	
}
