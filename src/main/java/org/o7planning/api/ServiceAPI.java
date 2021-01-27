package org.o7planning.api;

import java.util.ArrayList;

import org.o7planning.dto.ServiceDTO;
import org.o7planning.service.IServiceService;
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
public class ServiceAPI {
	@Autowired
	private IServiceService serviceService;
	
	@PostMapping(value = "/service")
	public ServiceDTO createService(@RequestBody ServiceDTO model) {
		return serviceService.save(model);
	}
	
	
	
	@PutMapping(value = "/service/{id}")
	public ServiceDTO updateService(@RequestBody ServiceDTO model, @PathVariable("id") long id) {
		// set id
		return serviceService.save(model);
	}
	
	@DeleteMapping(value= "/service")
	public void deleteService(@RequestBody long[] ids ) {
		serviceService.delete(ids);
	}
	
	@GetMapping(value = "/service")
	public ArrayList<ServiceDTO> getService() {
		return serviceService.getAll();
	}
	
	
	@DeleteMapping(value= "/service/{id}")
	public void deleteService(@PathVariable("id") long id) {
		serviceService.deleteById(id);;
	}
}
