package org.o7planning.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "room")
public class RoomEntity extends BaseEntity{
	
	@Column(name = "numberRoom")
	private String number_room;
	
	@Column(name = "typeRoom")
	private String type_room;
	
	@Column(name = "price")
	private Long price;
	
	@Column(name = "maxPeople")
	private Integer max_people;
	
	@Column(name = "numberPCurrent")
	private Integer numberpcurrent;
	
	@OneToMany(mappedBy = "room")
	private List<StudentEntity> students = new ArrayList<>();
	
	

	public String getNumberRoom() {
		return number_room;
	}

	public void setNumberRoom(String numberRoom) {
		this.number_room = numberRoom;
	}

	public String getTypeRoom() {
		return type_room;
	}

	public void setTypeRoom(String typeRoom) {
		this.type_room = typeRoom;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Integer getMaxPeople() {
		return max_people;
	}

	public void setMaxPeople(Integer maxPeople) {
		this.max_people = maxPeople;
	}

	public Integer getNumberPCurrent() {
		return numberpcurrent;
	}

	public void setNumberPCurrent(Integer numberPCurrent) {
		this.numberpcurrent = numberPCurrent;
	}

	public RoomEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
