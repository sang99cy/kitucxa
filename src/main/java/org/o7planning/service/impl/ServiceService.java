package org.o7planning.service.impl;

import java.util.ArrayList;

import org.o7planning.converter.ServiceConverter;
import org.o7planning.dto.ServiceDTO;
import org.o7planning.entity.ServiceEntity;
import org.o7planning.repository.ServiceRepository;
import org.o7planning.service.IServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceService implements IServiceService{
	
	@Autowired
	private ServiceConverter serviceConverter;
	
	@Autowired
	private ServiceRepository serviceRepository;
	
	@Override
	public ServiceDTO save(ServiceDTO serviceDTO) {
		ServiceEntity serviceEntity = new ServiceEntity();
		if(serviceDTO.getId() != null) {
			ServiceEntity oldServiceEntity = serviceRepository.findOne(serviceDTO.getId());
			serviceEntity = serviceConverter.toEntity(serviceDTO, oldServiceEntity);
		} else {
			serviceEntity = serviceConverter.toEntity(serviceDTO);
		}
		serviceEntity = serviceRepository.save(serviceEntity);
		return serviceConverter.toDTO(serviceEntity);
	}

	@Override
	public void delete(long[] ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(long id) {
		serviceRepository.delete(id);
		
	}

	@Override
	public ArrayList<ServiceDTO> getAll() {
		ArrayList<ServiceEntity> a = (ArrayList<ServiceEntity>) serviceRepository.findAll();
		return serviceConverter.toListDTO(a);
	}

}
