package org.o7planning.service;

import java.util.ArrayList;

import org.o7planning.dto.ServiceDTO;

public interface IServiceService {
	ServiceDTO save(ServiceDTO serviceDTO);
	void delete(long[] ids);
	void deleteById(long id);
	ArrayList<ServiceDTO> getAll();
}
