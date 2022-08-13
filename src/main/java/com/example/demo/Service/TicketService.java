package com.example.demo.Service;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.model.Passanger;
import com.example.demo.model.Ticket;

@Service
public class TicketService {
	
public Ticket Passanger1(Passanger p) {
		
		WebClient webClient = WebClient.create();
		  
		String url="http://localhost:9090/bookTicket";
		
	Ticket block = webClient.post()
		         .uri(url)
		         .accept(MediaType.APPLICATION_JSON)
		         .contentType(MediaType.APPLICATION_JSON)
		         .body(BodyInserters.fromValue(p))
		         .retrieve()
		         .bodyToMono(Ticket.class)
		         .block();
	
		return block;

}
}
