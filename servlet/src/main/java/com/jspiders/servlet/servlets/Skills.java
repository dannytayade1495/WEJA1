package com.jspiders.servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/skills")
public class Skills extends HttpServlet {

	protected void doPost(HttpServletRequest request, 
						HttpServletResponse response) 
						throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String[] skills = request.getParameterValues("skills");
		writer.println("<h1>Your Technical Skills Are</h1>");
		for (String skill : skills) {
			writer.println("<h3>" + skill + "</h3>");
		}
	}

}
