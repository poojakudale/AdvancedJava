package com.simpli.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(name = "Access", urlPatterns = { "/Access" })
public class Demo extends HttpServlet
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		ServletContext context = getServletContext();
		
		String clg = context.getInitParameter("Collage");
		int id =Integer.parseInt(context.getInitParameter("ID"));
		
		out.print(id+" : "+clg);
		
		ServletConfig con = getServletConfig();
		
		out.print("<br>"+con.getInitParameter("name"));
		
		
	}

}
