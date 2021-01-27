package org.o7planning.service;

import java.util.ArrayList;

import org.o7planning.dto.RoomDTO;

public interface IRoomService {
	RoomDTO save(RoomDTO roomDTO);
	void delete(long[] ids);
	void deleteById(long id);
	ArrayList<RoomDTO> getAll();
	ArrayList<RoomDTO> getRoomByNumberRoom(String number_room);
	RoomDTO getRoomById(Long id);
	void updateNumberPCurrent(Long id);
}
