package com.scope;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getAttribute("key").toString();
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		HttpSession sess = request.getSession();
		
		ServletContext con = getServletContext();
		pw.print("<br>"+con.getAttribute("Course"));
		pw.print("<br>"+sess.getAttribute("comp"));
		
		
		
		pw.print("<br>Hello "+name);
	}

}
