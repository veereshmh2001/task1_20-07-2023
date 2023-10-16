package player;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/veeru", loadOnStartup = 2)
public class PlayerResources extends HttpServlet{
	
	
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String name =req.getParameter("name");
		String sports =req.getParameter("sports");
		String place =req.getParameter("place");
		String experience =req.getParameter("experience");
		
		System.out.println("Name :" + name);
		System.out.println("sports :" + sports);
		System.out.println("place :" + place);
		System.out.println("experience :" + experience);
		
		resp.setContentType("text/plain");
		PrintWriter writer=resp.getWriter();
		
		 writer.println(name + " plays " + sports + " in " + place + " having experince " +  experience + " years ");
		 System.out.println("Information saved successfully");
		 
	}
	

}
