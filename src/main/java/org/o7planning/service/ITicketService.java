package org.o7planning.service;

import org.o7planning.dto.TicketDTO;

public interface ITicketService {
	TicketDTO save(TicketDTO ticketDTO);
	void delete(long[] ids);
	void deleteById(long id);
}
