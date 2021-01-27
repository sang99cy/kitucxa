package org.o7planning.service.impl;

import org.o7planning.converter.TicketConverter;
import org.o7planning.dto.TicketDTO;
import org.o7planning.entity.TicketEntity;
import org.o7planning.repository.TicketRepository;
import org.o7planning.service.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService implements ITicketService {
	@Autowired
	private TicketConverter ticketConverter;

	@Autowired
	private TicketRepository ticketRepository;

	@Override
	public TicketDTO save(TicketDTO ticketDTO) {
		TicketEntity ticketEntity = new TicketEntity();
		if (ticketDTO.getId() != null) {
			TicketEntity oldTicketEntity = ticketRepository.findOne(ticketDTO.getId());
			ticketEntity = ticketConverter.toEntity(ticketDTO, oldTicketEntity);
		} else {
			ticketEntity = ticketConverter.toEntity(ticketDTO);
		}
		ticketEntity = ticketRepository.save(ticketEntity);
		return ticketConverter.toDTO(ticketEntity);
	}

	@Override
	public void delete(long[] ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(long id) {
		ticketRepository.delete(id);

	}
}
