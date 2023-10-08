package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//We will be doing this with the help of servlet mapping and not annotations

@SuppressWarnings("serial")
public class ValidationServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		PrintWriter out=res.getWriter();
		//Getting config param from web.xml file and it is for a particular servlet
		//Same for context but it is global and can be accessed in any servlet
		ServletConfig sc=getServletConfig();
		ServletContext sc1=getServletContext();
		
		String username2=sc1.getInitParameter("Name");
		String username =sc.getInitParameter("Name");
		if(name.equals("Imran") && password.equals("xyz"))
		{
			out.println("Validated"+username+username2);
		}
	}
}
