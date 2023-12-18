package com.xworkz.contact;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/contactInfo", loadOnStartup = 4)
public class ContactDisplay extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String mobileNumber = req.getParameter("mobileNumber");
		String comment = req.getParameter("comment");
		
		req.setAttribute("name", name);
		req.setAttribute("email", email);
		req.setAttribute("mobileNumber", mobileNumber);
		req.setAttribute("comment", comment);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("contactSuccess.jsp");
		dispatcher.forward(req, resp);
	}
	
	

}
