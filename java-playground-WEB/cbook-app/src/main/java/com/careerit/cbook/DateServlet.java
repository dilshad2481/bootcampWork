package com.careerit.cbook;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/showdate")
public class DateServlet extends HttpServlet{//extends GenericServlet //implements Servlet {
//You can either implement Servlet interface or extend GenericServlet which itself implements Servlet interface
//Since Servlet mainly required http requests you could just use HttpServlet which extends the genericServlet
//Servlet - interface
//GenericServlet - class
//HttpServlet - class
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			super.doPost(req, resp);
		}
	
	
//	@Override
//	public ServletConfig getServletConfig() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getServletInfo() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void init(ServletConfig arg0) throws ServletException {
//		System.out.println("initializing...");
//	}
//	
//	@Override
//	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
//		
//		System.out.println("service");		
//	}
//	
//	@Override
//	public void destroy() {
//		System.out.println("Destroyed");		
//	}
}
