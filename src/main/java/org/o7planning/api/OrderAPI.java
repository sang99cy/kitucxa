package org.o7planning.api;

import org.o7planning.dto.OrderDTO;
import org.o7planning.service.IOrderService;
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
public class OrderAPI {
	@Autowired
	private IOrderService orderService;
	
	@PostMapping(value = "/order")
	public OrderDTO createOrder(@RequestBody OrderDTO model) {
		return orderService.save(model);
	}
	
	
	
	@PutMapping(value = "/order/{id}")
	public OrderDTO updateOrder(@RequestBody OrderDTO model, @PathVariable("id") long id) {
		// set id
		return orderService.save(model);
	}
	
	@DeleteMapping(value= "/order")
	public void deleteOrder(@RequestBody long[] ids ) {
		orderService.delete(ids);
	}
	
	
	@DeleteMapping(value= "/order/{id}")
	public void deleteOrder(@PathVariable("id") long id) {
		orderService.deleteById(id);;
	}
}
