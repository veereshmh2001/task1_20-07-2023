package poc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/Add", loadOnStartup = 5)
public class Address extends HttpServlet{
	public Address() {
		System.out.println("Address object is created");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String no=req.getParameter("number");
		String state=req.getParameter("state");
		String street=req.getParameter("street");
		String city=req.getParameter("city");
		
		req.setAttribute("no", no);
		req.setAttribute("state", state);
		req.setAttribute("street", street);
		req.setAttribute("city", city);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("AddressSuccess.jsp");
		dispatcher.forward(req, resp);


	}

}
