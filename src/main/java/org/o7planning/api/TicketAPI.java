package org.o7planning.api;

import org.o7planning.dto.TicketDTO;
import org.o7planning.service.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class TicketAPI {
	@Autowired
	private ITicketService ticketService;
	
	@PostMapping(value = "/ticket")
	public TicketDTO createTicket(@RequestBody TicketDTO model) {
		return ticketService.save(model);
	}
	
	
	
	@PutMapping(value = "/ticket/{id}")
	public TicketDTO updateTicket(@RequestBody TicketDTO model, @PathVariable("id") long id) {
		// set id
		return ticketService.save(model);
	}
	
	@DeleteMapping(value= "/ticket")
	public void deleteTicket(@RequestBody long[] ids ) {
		ticketService.delete(ids);
	}
	
	
	@DeleteMapping(value= "/ticket/{id}")
	public void deleteTicket(@PathVariable("id") long id) {
		ticketService.deleteById(id);;
	}
}
