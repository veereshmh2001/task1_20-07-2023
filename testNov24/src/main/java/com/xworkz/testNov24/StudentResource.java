package com.xworkz.testNov24;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/student", loadOnStartup = 3)
public class StudentResource extends HttpServlet{
	
	public StudentResource() {
		System.out.println("Student Resource");
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fName=req.getParameter("fName");
		String lName=req.getParameter("lName");
		String mName=req.getParameter("mName");
		String mobileNumber=req.getParameter("mobileNumber");
		String gender=req.getParameter("gender");
		String area=req.getParameter("area");
		String district=req.getParameter("district");
		String state=req.getParameter("state");
		String pincode=req.getParameter("pincode");
		
		
		req.setAttribute("fName", fName);
		req.setAttribute("lName", lName);
		req.setAttribute("mName", mName);
		req.setAttribute("mobileNumber", mobileNumber);
		req.setAttribute("gender", gender);
		req.setAttribute("area", area);
		req.setAttribute("district", district);
		req.setAttribute("state", state);
		req.setAttribute("pincode", pincode);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("StudentInfo.jsp");
		dispatcher.forward(req, resp);
	}
	
	

}
