package org.o7planning.dto;

public class RoomDTO extends AbtractDTO {

	private String number_room;

	private String type_room;

	private Long price;

	private Integer max_people;

	private Integer numberpcurrent;

	public RoomDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNumber_room() {
		return number_room;
	}

	public void setNumber_room(String number_room) {
		this.number_room = number_room;
	}

	public String getType_room() {
		return type_room;
	}

	public void setType_room(String type_room) {
		this.type_room = type_room;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Integer getMax_people() {
		return max_people;
	}

	public void setMax_people(Integer max_people) {
		this.max_people = max_people;
	}

	public Integer getNumberpcurrent() {
		return numberpcurrent;
	}

	public void setNumberpcurrent(Integer numberpcurrent) {
		this.numberpcurrent = numberpcurrent;
	}

	
	
	
}
