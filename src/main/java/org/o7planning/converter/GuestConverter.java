package org.o7planning.converter;

import java.util.ArrayList;

import org.o7planning.dto.GuestDTO;
import org.o7planning.dto.GuestDTO;
import org.o7planning.entity.GuestEntity;
import org.o7planning.entity.GuestEntity;
import org.springframework.stereotype.Component;

@Component
public class GuestConverter {
	public GuestEntity toEntity(GuestDTO guestDTO) {
		GuestEntity guestEntity = new GuestEntity();
		guestEntity.setFullName(guestDTO.getFull_name());
		guestEntity.setCmt(guestDTO.getCmt());
		guestEntity.setBirthDay(guestDTO.getBirth_day());
		guestEntity.setCreateDate(guestDTO.getCreateDate());
		return guestEntity;
	}

	public GuestDTO toDTO(GuestEntity guestEntity) {
		GuestDTO guestDTO = new GuestDTO();
		if(guestEntity.getId() != null) {
			guestDTO.setId(guestEntity.getId());
		}
		guestDTO.setFull_name(guestEntity.getFullName());
		guestDTO.setCmt(guestEntity.getCmt());
		guestDTO.setBirth_day(guestEntity.getBirthDay());
		guestDTO.setCreateDate(guestEntity.getCreateDate());
		return guestDTO;
	}
	public ArrayList<GuestDTO> toListDTO(ArrayList<GuestEntity> guestEntitys) {
		ArrayList<GuestDTO> guestDTOs = new ArrayList<GuestDTO>();
		for(GuestEntity guestEntity: guestEntitys) {
			GuestDTO guestDTO = this.toDTO(guestEntity);
			guestDTOs.add(guestDTO);
		}
		
		return guestDTOs;
	}

	public GuestEntity toEntity(GuestDTO guestDTO, GuestEntity guestEntity) {
		guestEntity.setFullName(guestDTO.getFull_name());
		guestEntity.setCmt(guestDTO.getCmt());
		guestEntity.setBirthDay(guestDTO.getBirth_day());
		guestEntity.setCreateDate(guestDTO.getCreateDate());
		return guestEntity;
	}
}
