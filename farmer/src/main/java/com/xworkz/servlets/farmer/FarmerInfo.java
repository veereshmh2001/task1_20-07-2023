package com.xworkz.servlets.farmer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/veeru", loadOnStartup = 2)
public class FarmerInfo extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String farmerName = req.getParameter("farmerName");
		String area = req.getParameter("area");
		String soilType = req.getParameter("soilType");
		String crop = req.getParameter("crop");
		String fertilizer = req.getParameter("fertilizer");
		String season = req.getParameter("season");
		String investment = req.getParameter("investment");
		String profit = req.getParameter("profit");
		String landNumber = req.getParameter("landNumber");

		double convertedInvestment = Double.parseDouble(investment);
		double convertedProfit = Double.parseDouble(profit);

		System.out.println("Farmer Name: " + farmerName);
		System.out.println("Area: " + area);
		System.out.println("soilType: " + soilType);
		System.out.println("crop: " + crop);
		System.out.println("fertilizer: " + fertilizer);
		System.out.println("season: " + season);
		System.out.println("Investment: " + investment);
		System.out.println("Profit: " + profit);
		System.out.println("Land Number: " + landNumber);

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.print(farmerName + " information saved successfully");
		writer.print("<!DOCTYPE html>\r\n" 
				+ "<html>\r\n" + "<head>\r\n" + "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>X-workz</title>\r\n"
				+ "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">\r\n"
				+ "</head>\r\n" + "<body>\r\n" + "<nav class=\"navbar\" style=\"background-color: #e3f2fd;\">\r\n"
				+ "  <div class=\"container-fluid\">\r\n" + "    <a class=\"navbar-brand\" href=\"#\">Navbar</a>\r\n"
				+ "    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" \r\n"
				+ "    aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n"
				+ "      <span class=\"navbar-toggler-icon\"></span>\r\n" + "    </button>\r\n"
				+ "    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n"
				+ "      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n" + "        <li class=\"nav-item\">\r\n"
				+ "          <a class=\"nav-link active\" aria-current=\"page\" href=\"farmer.html\">Farmer</a>\r\n"
				+ "        </li>\r\n" + "        \r\n" + "    </div>\r\n" + "  </div>\r\n" + "</nav>\r\n"
				+ "<h1>Farmer Details.....</h1>\r\n"
				+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\" crossorigin=\"anonymous\"></script>\r\n"
				+ "</body>\r\n" + "</html>\r\n" + "");
		writer.print("</br>Farmer Name: " + farmerName);
		writer.print("</br>Area: " + area);
		writer.print("</br>soilType: " + soilType);
		writer.print("</br>crop: " + crop);
		writer.print("</br>fertilizer: " + fertilizer);
		writer.print("</br>season: " + season);
		writer.print("</br>Investment: " + investment);
		writer.print("</br>Profit: " + profit);
		writer.print("</br>Land Number: " + landNumber);

		if (convertedProfit > convertedInvestment) {
			System.out.println("</br><span style='color:green;'>Farmer is happy");
		} else {
			System.err.println("</br><span style='color:red;'>Farmer is not happy");
		}

	}

}
