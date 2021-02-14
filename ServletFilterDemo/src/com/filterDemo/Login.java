package com.filterDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


//@WebFilter("/Login")
public class Login implements Filter 
{

	public void init(FilterConfig fConfig) throws ServletException
	{
		// TODO Auto-generated method stub
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
		{
			RequestDispatcher rd = null;
			PrintWriter out=response.getWriter();
			
			String password = request.getParameter("password");
			System.out.println("password is ?= "+password);
			
			if(password != null && password.equals("Admin@123"))
			{
				chain.doFilter(request, response);				
			}
			else
			{
				out.print("<p style='color : red ; font-size: large'>Username or Password is Invalid. Please Try Again....!</p>");
				rd = request.getRequestDispatcher("/index.html");
				rd.include(request, response);
			}
						
		
		}

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

}
