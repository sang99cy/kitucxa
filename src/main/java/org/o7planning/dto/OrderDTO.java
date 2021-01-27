package org.o7planning.dto;

public class OrderDTO extends AbtractDTO {
	
	private Long id_student;

	private Long total_price;

	private String status;

	public OrderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId_student() {
		return id_student;
	}

	public void setId_student(Long id_student) {
		this.id_student = id_student;
	}

	public Long getTotal_price() {
		return total_price;
	}

	public void setTotal_price(Long total_price) {
		this.total_price = total_price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
}
