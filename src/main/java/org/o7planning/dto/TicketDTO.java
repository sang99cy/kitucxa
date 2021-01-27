package org.o7planning.dto;

public class TicketDTO extends AbtractDTO {

	private String info_vehicle;
	
	private Long id_student;

	public TicketDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getInfo_vehicle() {
		return info_vehicle;
	}

	public void setInfo_vehicle(String info_vehicle) {
		this.info_vehicle = info_vehicle;
	}

	public Long getId_student() {
		return id_student;
	}

	public void setId_student(Long id_student) {
		this.id_student = id_student;
	}

	
	
	
}
