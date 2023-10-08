package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class HelloServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter out=res.getWriter();
		out.println("Hello");
	}
}
