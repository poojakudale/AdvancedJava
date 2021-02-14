package com.cookieDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Logout")
public class Logout extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Cookie cookie = null;
		
		Cookie[] ck = request.getCookies();
		if(ck != null)
		{
			for(Cookie cook : ck)  // for(Cookie i :array_name)
			{
				if(cook.getName().equals("Admin"))
				{
					cookie = cook;
					break;
				}
			}
			
		}
		
		if(cookie !=null)
		{
			cookie.setMaxAge(0);
			response.addCookie(cookie);
		}
		response.sendRedirect("Login.html");
	}

}
