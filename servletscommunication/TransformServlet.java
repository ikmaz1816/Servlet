package com.servletscommunication;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/transform")
public class TransformServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		int a =Integer.parseInt(req.getParameter("num1"));
		req.setAttribute("num",a);
		RequestDispatcher rd=req.getRequestDispatcher("multiply");
		RequestDispatcher rd1=req.getRequestDispatcher("home.jsp");
		rd.forward(req, res);
		rd1.forward(req, res);
	}
}
