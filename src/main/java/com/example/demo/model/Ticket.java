package com.example.demo.model;


public class Ticket {
	
	private double pnr;
	private double TicketPrice;
	private String TicketStatus;
	public double getPnr() {
		return pnr;
	}
	public void setPnr(double pnr) {
		this.pnr = pnr;
	}
	public double getTicketPrice() {
		return TicketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		TicketPrice = ticketPrice;
	}
	public String getTicketStatus() {
		return TicketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		TicketStatus = ticketStatus;
	}
	@Override
	public String toString() {
		return "Ticket [pnr=" + pnr + ", TicketPrice=" + TicketPrice + ", TicketStatus=" + TicketStatus + "]";
	}
	

}
