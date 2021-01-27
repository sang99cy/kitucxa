package org.o7planning.api;

import java.util.ArrayList;

import org.o7planning.dto.RoomDTO;
import org.o7planning.service.IRoomService;
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
public class RoomAPI {
	@Autowired
	private IRoomService roomService;
	
	@PostMapping(value = "/room")
	public RoomDTO createRoom(@RequestBody RoomDTO model) {
		return roomService.save(model);
	}
	
	
	
	@PutMapping(value = "/room/{id}")
	public RoomDTO updateRoom(@RequestBody RoomDTO model, @PathVariable("id") long id) {
		// set id
		return roomService.save(model);
	}
	@GetMapping(value = "/room")
	public ArrayList<RoomDTO> getRoom() {
		return roomService.getAll();
	}
	
	@DeleteMapping(value= "/room")
	public void deleteRoom(@RequestBody long[] ids ) {
		roomService.delete(ids);
	}
	
	
	@DeleteMapping(value= "/room/{id}")
	public void deleteRoom(@PathVariable("id") long id) {
		roomService.deleteById(id);;
	}
	
	@GetMapping(value = "/room/{id}")
	public RoomDTO getRoomById(@PathVariable("id") Long id) {
		return roomService.getRoomById(id);
	}
}
