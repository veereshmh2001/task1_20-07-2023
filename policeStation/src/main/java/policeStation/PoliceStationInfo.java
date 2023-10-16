package policeStation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/police", loadOnStartup = 4)
public class PoliceStationInfo extends HttpServlet {

	public PoliceStationInfo() {
		System.out.println("Police Station Form Created");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String stationName = req.getParameter("stationName");
		String location = req.getParameter("location");
		String inspectorName = req.getParameter("inspectorName");
		String headConstable = req.getParameter("headConstable");
		String assistantCommissioner = req.getParameter("assistantCommissioner");
		String numberOfCell = req.getParameter("numberOfCell");
		String numberOfCasePending = req.getParameter("numberOfCasePending");
		String painted = req.getParameter("painted");

		System.out.println("Station Name : " + stationName);
		System.out.println("Location : " + location);
		System.out.println("Inspector Name : " + inspectorName);
		System.out.println("Head Constable : " + headConstable);
		System.out.println("Assistant Commissioner : " + assistantCommissioner);
		System.out.println("Number of Cell : " + numberOfCell);
		System.out.println("Number of Case pending : " + numberOfCasePending);
		System.out.println("Painted : " + painted);
		
		int convertedNumberOfCell = Integer.parseInt(numberOfCell);
		int convertedNumberOfCasePending = Integer.parseInt(numberOfCasePending);
		boolean convertedPainted = Boolean.getBoolean(painted);
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.print("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>X-workz</title>\r\n"
				+ "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<nav class=\"navbar\" style=\"background-color: #e3f2fd;\">\r\n"
				+ "  <div class=\"container-fluid\">\r\n"
				+ "    <a class=\"navbar-brand\" href=\"#\">Navbar</a>\r\n"
				+ "    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" \r\n"
				+ "    aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n"
				+ "      <span class=\"navbar-toggler-icon\"></span>\r\n"
				+ "    </button>\r\n"
				+ "    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n"
				+ "      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n"
				+ "        <li class=\"nav-item\">\r\n"
				+ "          <a class=\"nav-link active\" aria-current=\"page\" href=\"policeStation.html\">PoliceStation</a>\r\n"
				+ "        </li>\r\n"
				+ "        \r\n"
				+ "    </div>\r\n"
				+ "  </div>\r\n"
				+ "</nav>\r\n"
				+ "<h1> Rajajinagar Police Station</h1>\r\n"
				+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\" crossorigin=\"anonymous\"></script>\r\n"
				+ "</body>\r\n"
				+ "</html>\r\n");
		writer.print("</br>Station Name : " + stationName);
		writer.print("</br>Location : " + location);
		writer.print("</br>Inspector Name : " + inspectorName);
		writer.print("</br>Head Constable : " + headConstable);
		writer.print("</br>Assistant Commissioner : " + assistantCommissioner);
		writer.print("</br>Number of Cell : " + numberOfCell);
		writer.print("</br>Number of Case pending : " + numberOfCasePending);
		writer.print("</br>Painted : " + painted);
		
		if(convertedNumberOfCell > 10) {
			writer.print("</br><span style ='color:green;'It is a big station");
		}else {
			writer.print("</br><span style ='color:green;'It is a big station");
		}
		
		if(convertedNumberOfCasePending > 100) {
			writer.print("</br><span style ='color:green;' Many cases are pending");
		}else {
			writer.print("</br><span style ='color:green;' Cases are less");
		}
		
		if(convertedPainted == true) {
			writer.print("</br><span style ='color:green;' Many cases are pending");
			
		}else {
			writer.print("</br><span style ='color:green;' Cases are less");
		}
		
		


	}

}
