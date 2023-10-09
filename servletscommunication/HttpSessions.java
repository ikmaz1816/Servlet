package com.servletscommunication;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/sessions")
public class HttpSessions extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int num=Integer.parseInt(req.getParameter("num1"));
		HttpSession session=req.getSession();
		session.setAttribute("number1", num);
		String s=num +"";
		Cookie cookie=new Cookie("num1",s);
		res.addCookie(cookie);
		res.sendRedirect("using");
		
	}
}
