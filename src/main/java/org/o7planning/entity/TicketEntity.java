package org.o7planning.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class TicketEntity extends BaseEntity{
	
	
	@Column(name = "infoVehicle")
	private String info_vehicle;
	
	@ManyToOne
	@JoinColumn(name = "id_student")
	private StudentEntity student;
	
	@OneToMany(mappedBy = "ticket")
	private List<ActivitiesEntity> activitiess = new ArrayList<>();

	public TicketEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StudentEntity getStudent() {
		return student;
	}

	public void setStudent(StudentEntity student) {
		this.student = student;
	}

	

	public StudentEntity getStudents() {
		return student;
	}

	public void setStudents(StudentEntity students) {
		this.student = students;
	}

	public List<ActivitiesEntity> getActivitiess() {
		return activitiess;
	}

	public void setActivitiess(List<ActivitiesEntity> activitiess) {
		this.activitiess = activitiess;
	}

	public String getInfoVehicle() {
		return info_vehicle;
	}

	public void setInfoVehicle(String infoVehicle) {
		this.info_vehicle = infoVehicle;
	}

	

	
	
	
}
