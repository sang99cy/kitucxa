package org.o7planning.service;

import org.o7planning.dto.OrderDTO;

public interface IOrderService {
	OrderDTO save(OrderDTO orderDTO);
	void delete(long[] ids);
	void deleteById(long id);
}
