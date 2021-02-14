package com.sessionDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/HiddenServlet")
public class HiddenServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String nm = request.getParameter("user");
		out.print("Welcome "+nm+"<br>");
		
		out.print("<form action='Second'>");
		out.print("<input type='hidden' name = 'uname' value = '"+nm+"'>");
		out.print("<input type='submit' value='click'>");
		out.print("</form>");
	
	}

}
