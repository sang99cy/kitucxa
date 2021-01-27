package org.o7planning.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class StudentEntity extends BaseEntity {

	@Column(name = "code")
	private String code;

	@Column(name = "full_name")
	private String full_name;

	@Column(name = "cmt")
	private String cmt;

	@Column(name = "birth_day")
	private Date birth_day;

	@Column(name = "name_class")
	private String name_class;

	@Column(name = "hometown")
	private String hometown;

	@ManyToOne
	@JoinColumn(name = "id_room")
	private RoomEntity room;

	@OneToMany(mappedBy = "student")
	private List<GuestEntity> guests = new ArrayList<>();

	@OneToMany(mappedBy = "student")
	private List<TicketEntity> tickets = new ArrayList<>();

	@OneToMany(mappedBy = "student")
	private List<OrderEntity> orders = new ArrayList<>();

	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public RoomEntity getRoom() {
		return room;
	}


	public void setRoom(RoomEntity room) {
		this.room = room;
	}


	public List<GuestEntity> getGuests() {
		return guests;
	}


	public void setGuests(List<GuestEntity> guests) {
		this.guests = guests;
	}


	public List<TicketEntity> getTickets() {
		return tickets;
	}


	public void setTickets(List<TicketEntity> tickets) {
		this.tickets = tickets;
	}


	public List<OrderEntity> getOrders() {
		return orders;
	}


	public void setOrders(List<OrderEntity> orders) {
		this.orders = orders;
	}


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFullName() {
		return full_name;
	}

	public void setFullName(String fullName) {
		this.full_name = fullName;
	}

	public String getCmt() {
		return cmt;
	}

	public void setCmt(String cmt) {
		this.cmt = cmt;
	}

	public Date getBirthDay() {
		return birth_day;
	}

	public void setBirthDay(Date birthDay) {
		this.birth_day = birthDay;
	}

	public String getNameClass() {
		return name_class;
	}

	public void setNameClass(String nameClass) {
		this.name_class = nameClass;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	

}
