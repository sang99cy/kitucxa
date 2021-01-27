package org.o7planning.dto;

public class ServiceDTO extends AbtractDTO {
	
	private String name;

	private String code;
	
	private Long price;
	
	private String time_service;

	public ServiceDTO() {
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

	public String getTime_service() {
		return time_service;
	}

	public void setTime_service(String time_service) {
		this.time_service = time_service;
	}

	
	
	
}
