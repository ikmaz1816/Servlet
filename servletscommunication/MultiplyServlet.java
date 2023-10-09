package com.servletscommunication;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/multiply")
public class MultiplyServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int num1=(int) req.getAttribute("num");
		PrintWriter out=res.getWriter();
		out.println(num1*5);
	}
}
