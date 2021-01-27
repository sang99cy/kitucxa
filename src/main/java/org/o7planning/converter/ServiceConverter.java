package org.o7planning.converter;

import java.util.ArrayList;

import org.o7planning.dto.ServiceDTO;
import org.o7planning.entity.ServiceEntity;
import org.springframework.stereotype.Component;

@Component
public class ServiceConverter {
	public ServiceEntity toEntity(ServiceDTO serviceDTO) {
		ServiceEntity serviceEntity = new ServiceEntity();
		serviceEntity.setCode(serviceDTO.getCode());
		serviceEntity.setName(serviceDTO.getName());
		serviceEntity.setPrice(serviceDTO.getPrice());
		serviceEntity.setTimeService(serviceDTO.getTime_service());
		return serviceEntity;
	}

	public ServiceDTO toDTO(ServiceEntity serviceEntity) {
		ServiceDTO serviceDTO = new ServiceDTO();
		if(serviceEntity.getId() != null) {
			serviceDTO.setId(serviceEntity.getId());
		}
		serviceDTO.setCode(serviceEntity.getCode());
		serviceDTO.setName(serviceEntity.getName());
		serviceDTO.setPrice(serviceEntity.getPrice());
		serviceDTO.setTime_service(serviceEntity.getTimeService());
		return serviceDTO;
	}

	public ServiceEntity toEntity(ServiceDTO serviceDTO, ServiceEntity serviceEntity) {
		serviceEntity.setCode(serviceDTO.getCode());
		serviceEntity.setName(serviceDTO.getName());
		serviceEntity.setPrice(serviceDTO.getPrice());
		serviceEntity.setTimeService(serviceDTO.getTime_service());
		return serviceEntity;
	}
	
	public ArrayList<ServiceDTO> toListDTO(ArrayList<ServiceEntity> serviceEntitys) {
		ArrayList<ServiceDTO> serviceDTOs = new ArrayList<ServiceDTO>();
		for(ServiceEntity serviceEntity: serviceEntitys) {
			ServiceDTO serviceDTO = this.toDTO(serviceEntity);
			serviceDTOs.add(serviceDTO);
		}
		
		return serviceDTOs;
	}
}
