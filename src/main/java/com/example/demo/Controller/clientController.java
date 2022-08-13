package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.TicketService;
import com.example.demo.model.Passanger;
import com.example.demo.model.Ticket;

@RestController
public class clientController {
	
	@Autowired
	private TicketService serviceClient;
	
	@PostMapping(value ="/book" ,consumes = {"application/json"} ,produces = {"application/json"})
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passanger passanger) {
		Ticket ticket = serviceClient.Passanger1(passanger);
		
		if(ticket==null) {
			System.out.println(ticket);
			ticket.setTicketStatus("Booking not confirmed");
			
			return new ResponseEntity<Ticket>(ticket,HttpStatus.BAD_REQUEST);
		}else
		
			return new ResponseEntity<Ticket>(ticket,HttpStatus.OK);

		
	
	}

}
