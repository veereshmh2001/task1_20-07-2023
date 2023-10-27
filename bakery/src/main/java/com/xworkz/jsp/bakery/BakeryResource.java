package com.xworkz.jsp.bakery;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/tasty", loadOnStartup = 4)
public class BakeryResource extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String name = req.getParameter("name");
	     String price = req.getParameter("price");
	     String quantity = req.getParameter("quantity");
	     String discount = req.getParameter("discount");
	     String gst = req.getParameter("gst");
	     String manfDate = req.getParameter("manfDate");
	     String expiryDate = req.getParameter("expiryDate");

	     double convertedPrice = Double.parseDouble(price);
	     int convertedQuantity = Integer.parseInt(quantity);
	     int convertedDiscount = Integer.parseInt(discount);

	     double total = (convertedPrice * convertedQuantity) * (1 - (convertedDiscount / 100.0));

	     req.setAttribute("name", name);
	     req.setAttribute("price", price);
	     req.setAttribute("quantity", quantity);
	     req.setAttribute("discount", discount);
	     req.setAttribute("gst", gst);
	     req.setAttribute("manfDate", manfDate);
	     req.setAttribute("expiryDate", expiryDate);
	     req.setAttribute("total", total);

	     System.out.println("Bakery details sent successfully");
	     RequestDispatcher dispatcher = req.getRequestDispatcher("bakeryDisplay.jsp");
	     dispatcher.forward(req, resp);
	 }

}
