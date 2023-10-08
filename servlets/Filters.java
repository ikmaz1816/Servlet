package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;

public class Filters implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException 
	{
		HttpServletRequest request=(HttpServletRequest)req;
		int num=Integer.parseInt(request.getParameter("number1"));
		PrintWriter out=res.getWriter();
		if(num>1)
			chain.doFilter(req, res);
		else
			out.println("Invalid");
		//filters are chained and once all  are conditions are validated then only the servlet is called else the value is returned
		
	}

}
