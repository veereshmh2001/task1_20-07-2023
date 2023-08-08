package com.veeresh.boot;

import com.veeresh.app.Ticket;
import com.veeresh.app.TicketBlack;

public class TicketRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in ticketRunner");
	
	
	Ticket ticket = new TicketBlack();
	ticket.soldout();
	}

}
