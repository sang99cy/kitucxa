package org.o7planning.service.impl;

import org.o7planning.converter.OrderConverter;
import org.o7planning.dto.OrderDTO;
import org.o7planning.entity.OrderEntity;
import org.o7planning.repository.OrderRepository;
import org.o7planning.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService{

	
	@Autowired
	private OrderConverter orderConverter;
	
	@Autowired
	private OrderRepository orderRepository;
	
	
	@Override
	public OrderDTO save(OrderDTO orderDTO) {
		OrderEntity orderEntity = new OrderEntity();
		if(orderDTO.getId() != null) {
			OrderEntity oldOrderEntity = orderRepository.findOne(orderDTO.getId());
			orderEntity = orderConverter.toEntity(orderDTO, oldOrderEntity);
		} else {
			orderEntity = orderConverter.toEntity(orderDTO);
		}
		orderEntity = orderRepository.save(orderEntity);
		return orderConverter.toDTO(orderEntity);
	}

	@Override
	public void delete(long[] ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(long id) {
		orderRepository.delete(id);
		
	}

}
