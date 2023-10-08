package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/add")
public class AddServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int num1=Integer.parseInt(req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
		
		PrintWriter out=res.getWriter();
		int sum=num1+num2;
		out.println("The sum is"+sum);
	}
}
