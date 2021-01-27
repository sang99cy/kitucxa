package org.o7planning.api;

import java.util.ArrayList;

import org.o7planning.dto.GuestDTO;
import org.o7planning.service.IGuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class GuestAPI {
	@Autowired
	private IGuestService guestService;
	
	@PostMapping(value = "/guest")
	public GuestDTO createGuest(@RequestBody GuestDTO model) {
		return guestService.save(model);
	}
	
	@GetMapping(value = "/guest")
	public ArrayList<GuestDTO> getGuest() {
		return guestService.getAll();
	}
	
	
	
	@PutMapping(value = "/guest/{id}")
	public GuestDTO updateGuest(@RequestBody GuestDTO model, @PathVariable("id") long id) {
		// set id
		return guestService.save(model);
	}
	
	@DeleteMapping(value= "/guest")
	public void deleteGuest(@RequestBody long[] ids ) {
		guestService.delete(ids);
	}
	
	
	@DeleteMapping(value= "/guest/{id}")
	public void deleteGuest(@PathVariable("id") long id) {
		guestService.deleteById(id);;
	}


}
