package com.servletscommunication;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/response")
public class ResponseServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		int a =Integer.parseInt(req.getParameter("num"));
		//If we want to pass variable in Redirect then we have to use url rewriting
		res.sendRedirect("redirect?a="+a);
	}
}
