package com.DIColl.CollectionDIMvn;

import java.util.Iterator;
import java.util.List;

public class Question
{
	private int id;
	private String name;
	
	private List<String> answer;
	
	public Question() {}
	
	public Question(int id, String name,List<String> answer)
	{
		this.id = id;
		this.name = name;
		this.answer = answer;
		
	}
	
	public void display()
	{
		System.out.println(id+" "+name);
		System.out.println("Answer is : ");
		
		Iterator<String> it = answer.iterator();
		while (it.hasNext()) 
		{
			System.out.println(it.next());
		}
	}
	
}
