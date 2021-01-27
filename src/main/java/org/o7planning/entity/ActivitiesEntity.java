package org.o7planning.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "activities")
public class ActivitiesEntity extends BaseEntity{
	@Column(name = "dateIn")
	private Date dateIn;
	
	@Column(name = "dateOut")
	private Date dateOut;
	
	@ManyToOne
	@JoinColumn(name = "id_ticket")
	private TicketEntity ticket;
	
	@Column(name = "numberOfDay")
	private Integer numberOfDay;

	public ActivitiesEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public TicketEntity getTickets() {
		return ticket;
	}



	public void setTickets(TicketEntity tickets) {
		this.ticket = tickets;
	}



	public Date getDateIn() {
		return dateIn;
	}

	public void setDateIn(Date dateIn) {
		this.dateIn = dateIn;
	}

	public Date getDateOut() {
		return dateOut;
	}

	public void setDateOut(Date dateOut) {
		this.dateOut = dateOut;
	}

	

	public Integer getNumberOfDay() {
		return numberOfDay;
	}

	public void setNumberOfDay(Integer numberOfDay) {
		this.numberOfDay = numberOfDay;
	}
	
	
}
