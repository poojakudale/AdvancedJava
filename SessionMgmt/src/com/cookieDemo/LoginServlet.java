package com.cookieDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String user =request.getParameter("usernm");
		String pass = request.getParameter("pwd");
		RequestDispatcher rd =null;
		if(user.equals("Admin")&&pass.equals("Admin@123"))
		{
				out.print("Welcome "+user);
				Cookie cookie = new Cookie("uname",user); // creating cookie object
				response.addCookie(cookie); //adding cookie in the response
				
				rd = request.getRequestDispatcher("Welcome");
				rd.forward(request, response);
		}
		else
		{
			out.print("Invalid Credentials!!!!");
			rd = request.getRequestDispatcher("Login.html");
			rd.include(request, response);
		}
		
	}
	
	

}
