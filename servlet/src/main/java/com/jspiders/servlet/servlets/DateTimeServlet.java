package com.jspiders.servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateTimeServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, 
							HttpServletResponse resp) 
							throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setHeader("Refresh", "1");
		PrintWriter writer = resp.getWriter();
		Date date = new Date();
		writer.println("<h1>" + date + "</h1>");
	}
}
