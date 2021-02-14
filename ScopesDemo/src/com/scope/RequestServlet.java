package com.scope;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/RequestServlet")
public class RequestServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String user = request.getParameter("unm");
		
		pw.print("Welcome "+user);
		 String company= "Simplilearn";
		 
		 request.setAttribute("key", user);
		 
		 HttpSession session = request.getSession();
		 ServletContext context = getServletContext();
		 context.setAttribute("Course", "JEE");
		 
		 session.setAttribute("comp",company);
//		 pw.print("<a href='SecondServlet'>Click</a>")
//		 pw.print("<form action='SecondServlet'>");
//		 pw.print("<input type='submit' value='go'>");
//		 pw.print("</form>");
//		 
		 RequestDispatcher rd = request.getRequestDispatcher("SecondServlet");
		 rd.include(request, response);
		
//		 RequestDispatcher rd = request.getRequestDispatcher("SecondServlet");
//		 rd.forward(request, response);
	}

}
