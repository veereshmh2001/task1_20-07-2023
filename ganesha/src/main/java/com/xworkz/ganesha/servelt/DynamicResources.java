package com.xworkz.ganesha.servelt;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;



@WebServlet(urlPatterns = "/veeru",loadOnStartup = 1)
public class DynamicResources extends HttpServlet{
	
	public DynamicResources() {
		System.out.println("created DynamicResources");
	}
	
	
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("Service method in DynamicResource");
	}
	

}
