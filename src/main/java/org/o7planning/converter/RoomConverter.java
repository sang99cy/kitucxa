package org.o7planning.converter;

import java.util.ArrayList;

import org.o7planning.dto.RoomDTO;
import org.o7planning.entity.RoomEntity;
import org.springframework.stereotype.Component;

@Component
public class RoomConverter {
	public RoomEntity toEntity(RoomDTO roomDTO) {
		RoomEntity roomEntity = new RoomEntity();
		roomEntity.setMaxPeople(roomDTO.getMax_people());
		roomEntity.setNumberPCurrent(roomDTO.getNumberpcurrent());
		roomEntity.setNumberRoom(roomDTO.getNumber_room());
		roomEntity.setPrice(roomDTO.getPrice());
		roomEntity.setTypeRoom(roomDTO.getType_room());
		return roomEntity;
	}

	public RoomDTO toDTO(RoomEntity roomEntity) {
		RoomDTO roomDTO = new RoomDTO();
		if (roomEntity.getId() != null) {
			roomDTO.setId(roomEntity.getId());
		}
		roomDTO.setMax_people(roomEntity.getMaxPeople());
		roomDTO.setNumberpcurrent(roomEntity.getNumberPCurrent());
		roomDTO.setNumber_room(roomEntity.getNumberRoom());
		roomDTO.setPrice(roomEntity.getPrice());
		roomDTO.setType_room(roomEntity.getTypeRoom());
		return roomDTO;
	}
	public ArrayList<RoomDTO> toListDTO(ArrayList<RoomEntity> roomEntitys) {
		ArrayList<RoomDTO> roomDTOs = new ArrayList<RoomDTO>();
		for(RoomEntity roomEntity: roomEntitys) {
			RoomDTO roomDTO = this.toDTO(roomEntity);
			roomDTOs.add(roomDTO);
		}
		
		return roomDTOs;
	}

	public RoomEntity toEntity(RoomDTO roomDTO, RoomEntity roomEntity) {
		roomEntity.setMaxPeople(roomDTO.getMax_people());
		roomEntity.setNumberPCurrent(roomDTO.getNumberpcurrent());
		roomEntity.setNumberRoom(roomDTO.getNumber_room());
		roomEntity.setPrice(roomDTO.getPrice());
		roomEntity.setTypeRoom(roomDTO.getType_room());
		return roomEntity;
	}
}
