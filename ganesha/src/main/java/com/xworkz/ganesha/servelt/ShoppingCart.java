package com.xworkz.ganesha.servelt;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/xworkz", loadOnStartup = 2)
public class ShoppingCart extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("productName");
		String quantity = req.getParameter("quantity");
		String brand = req.getParameter("brand");

		System.out.println("Product Name : " + name);
		System.out.println("Quantity : " + quantity);
		System.out.println("Brand : " + brand);

	}

}
