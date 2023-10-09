package com.servletscommunication;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/using")
public class UsingSession extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		HttpSession session=req.getSession();
		int number1=(int)session.getAttribute("number1");
		PrintWriter out=res.getWriter();
		out.println(number1);
		Cookie[] co=req.getCookies();
		for(Cookie c:co)
		{
			if(c.getName().equals("num1"))
			{
				out.println(c.getValue());
			}
		}
	}
}
