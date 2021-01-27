package org.o7planning.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "service")
public class ServiceEntity extends BaseEntity{
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "price")
	private Long price;
	
	@Column(name = "timeService")
	private String time_service;

	
	
	
	public ServiceEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getTimeService() {
		return time_service;
	}

	public void setTimeService(String timeService) {
		this.time_service = timeService;
	}
	
	
	
}
