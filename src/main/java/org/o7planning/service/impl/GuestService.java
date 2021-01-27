package org.o7planning.service.impl;

import java.util.ArrayList;

import org.o7planning.converter.GuestConverter;
import org.o7planning.dto.GuestDTO;
import org.o7planning.entity.GuestEntity;
import org.o7planning.repository.GuestRepository;
import org.o7planning.service.IGuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuestService implements IGuestService {

	@Autowired
	private GuestConverter guestConverter;

	@Autowired
	private GuestRepository guestRepository;

	@Override
	public GuestDTO save(GuestDTO guestDTO) {
		GuestEntity guestEntity = new GuestEntity();
		if (guestDTO.getId() != null) {
			GuestEntity oldguestEntity = guestRepository.findOne(guestDTO.getId());
			guestEntity = guestConverter.toEntity(guestDTO, oldguestEntity);
		} else {
			guestEntity = guestConverter.toEntity(guestDTO);
		}
		guestEntity = guestRepository.save(guestEntity);
		return guestConverter.toDTO(guestEntity);
	}

	@Override
	public void delete(long[] ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		guestRepository.delete(id);
	}

	@Override
	public ArrayList<GuestDTO> getAll() {
		ArrayList<GuestEntity> a = (ArrayList<GuestEntity>) guestRepository.findAll();
		return guestConverter.toListDTO(a);
	}

}
