package org.o7planning.service.impl;

import java.util.ArrayList;

import org.o7planning.converter.RoomConverter;
import org.o7planning.dto.RoomDTO;
import org.o7planning.entity.RoomEntity;
import org.o7planning.repository.RoomRepository;
import org.o7planning.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService implements IRoomService {

	@Autowired
	private RoomConverter roomConverter;

	@Autowired
	private RoomRepository roomRepository;

	@Override
	public RoomDTO save(RoomDTO roomDTO) {
		RoomEntity roomEntity = new RoomEntity();
		if (roomDTO.getId() != null) {
			RoomEntity oldRoomEntity = roomRepository.findOne(roomDTO.getId());
			roomEntity = roomConverter.toEntity(roomDTO, oldRoomEntity);
		} else {
			roomEntity = roomConverter.toEntity(roomDTO);
		}
		roomEntity = roomRepository.save(roomEntity);
		return roomConverter.toDTO(roomEntity);
	}

	@Override
	public void delete(long[] ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(long id) {
		roomRepository.delete(id);

	}

	@Override
	public ArrayList<RoomDTO> getAll() {
		ArrayList<RoomEntity> a = (ArrayList<RoomEntity>) roomRepository.findAll();
		return roomConverter.toListDTO(a);
	}

	@Override
	public RoomDTO getRoomById(Long id) {
		try {
			return roomConverter.toDTO(roomRepository.findOne(id));
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public ArrayList<RoomDTO> getRoomByNumberRoom(String number_room) {
		// TODO Auto-generated method stub
		
		return roomConverter.toListDTO(roomRepository.getRoomByNumberRoom(number_room));
	}

	@Override
	public void updateNumberPCurrent(Long id) {
		roomRepository.addNumberPeopleCurrent(id);
		
	}

	
	
	

}
