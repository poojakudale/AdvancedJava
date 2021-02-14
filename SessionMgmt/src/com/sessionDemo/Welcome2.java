package com.sessionDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Welcome2
 */
@WebServlet("/Welcome2")
public class Welcome2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession(false);
		String n = (String) session.getAttribute("unm");
		String id = session.getId();
		
		out.print("HEllo "+n+"<br>Your Unique id is : "+id);
		
		out.print("<form action='SessionLogout'>");
		out.print("<input type='submit' value='Logout'>");
		out.print("</form>");
	}

}
