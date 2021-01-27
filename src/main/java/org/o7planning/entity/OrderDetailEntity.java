package org.o7planning.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orderDetail")
public class OrderDetailEntity extends BaseEntity{
	
	@OneToOne 
    @JoinColumn(name = "id_service")
	private ServiceEntity service;
	
	@ManyToOne
	@JoinColumn(name = "id_order")
	private OrderEntity orders;
	
	@Column(name = "numbers")
	private Integer numbers;
	
	@Column(name = "originalPrice")
	private Long original_price;
	
	@Column(name = "amount")
	private Long amount;

	public OrderDetailEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public ServiceEntity getServices() {
		return service;
	}



	public void setServices(ServiceEntity services) {
		this.service = services;
	}



	public OrderEntity getOrders() {
		return orders;
	}



	public void setOrders(OrderEntity orders) {
		this.orders = orders;
	}



	public ServiceEntity getService() {
		return service;
	}



	public void setService(ServiceEntity service) {
		this.service = service;
	}



	public OrderEntity getOrder() {
		return orders;
	}



	public void setOrder(OrderEntity order) {
		this.orders = order;
	}



	public Integer getNumbers() {
		return numbers;
	}

	public void setNumbers(Integer numbers) {
		this.numbers = numbers;
	}

	public Long getOriginalPrice() {
		return original_price;
	}

	public void setOriginalPrice(Long originalPrice) {
		this.original_price = originalPrice;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}
	
	
	
}
