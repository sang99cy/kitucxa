package org.o7planning.converter;

import org.o7planning.dto.OrderDTO;
import org.o7planning.entity.OrderEntity;
import org.springframework.stereotype.Component;

@Component
public class OrderConverter {
	public OrderEntity toEntity(OrderDTO orderDTO) {
		OrderEntity orderEntity = new OrderEntity();
		orderEntity.setCreateDate(orderDTO.getCreateDate());
		orderEntity.setStatus(orderDTO.getStatus());
		orderEntity.setTotalPrice(orderDTO.getTotal_price());
		return orderEntity;
	}

	public OrderDTO toDTO(OrderEntity orderEntity) {
		OrderDTO orderDTO = new OrderDTO();
		if(orderEntity.getId() != null) {
			orderDTO.setId(orderEntity.getId());
		}
		orderEntity.setCreateDate(orderDTO.getCreateDate());
		orderEntity.setStatus(orderDTO.getStatus());
		orderEntity.setTotalPrice(orderDTO.getTotal_price());
		return orderDTO;
	}

	public OrderEntity toEntity(OrderDTO orderDTO, OrderEntity orderEntity) {
		orderEntity.setCreateDate(orderDTO.getCreateDate());
		orderEntity.setStatus(orderDTO.getStatus());
		orderEntity.setTotalPrice(orderDTO.getTotal_price());
		return orderEntity;
	}
}
