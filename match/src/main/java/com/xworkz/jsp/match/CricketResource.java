package com.xworkz.jsp.match;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/win", loadOnStartup = 3)
public class CricketResource extends HttpServlet {

	public CricketResource() {
		System.out.println("Created Cricket Resource");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String tournamentName = req.getParameter("tournamentName");
		String hostingCountry = req.getParameter("hostingCountry");
		String matchDate = req.getParameter("matchDate");
		String team1 = req.getParameter("team1");
		String team2 = req.getParameter("team2");
		String team1CaptainName = req.getParameter("team1CaptainName");
		String team2CaptainName = req.getParameter("team2CaptainName");
		String umpireName = req.getParameter("umpireName");
		String thirdUmpireName = req.getParameter("thirdUmpireName");
		String stadiumName = req.getParameter("stadiumName");
		String stadiumCapacity = req.getParameter("stadiumCapacity");


		req.setAttribute("tournamentName", tournamentName);
		req.setAttribute("hostingCountry", hostingCountry);
		req.setAttribute("matchDate", matchDate);
		req.setAttribute("team1", team1);
		req.setAttribute("team2", team2);
		req.setAttribute("team1CaptainName", team1CaptainName);
		req.setAttribute("team2CaptainName", team2CaptainName);
		req.setAttribute("umpireName", umpireName);
		req.setAttribute("thirdUmpireName", thirdUmpireName);
		req.setAttribute("stadiumName", stadiumName);
		req.setAttribute("stadiumCapacity", stadiumCapacity);

		RequestDispatcher dispatcher = req.getRequestDispatcher("cricketWin.jsp");
		dispatcher.forward(req, resp);

	}

}
