package org.o7planning.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "guest")
public class GuestEntity extends BaseEntity {

	@Column(name = "cmt")
	private String cmt;

	@Column(name = "fullName")
	private String full_name;

	@Column(name = "birthDay")
	private Date birth_day;

	@ManyToOne
	@JoinColumn(name = "id_student")
	private StudentEntity student;

	public GuestEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public StudentEntity getStudents() {
		return student;
	}


	public void setStudents(StudentEntity students) {
		this.student = students;
	}


	public StudentEntity getStudent() {
		return student;
	}


	public void setStudent(StudentEntity student) {
		this.student = student;
	}


	public String getCmt() {
		return cmt;
	}

	public void setCmt(String cmt) {
		this.cmt = cmt;
	}

	public String getFullName() {
		return full_name;
	}

	public void setFullName(String fullName) {
		this.full_name = fullName;
	}

	public Date getBirthDay() {
		return birth_day;
	}

	public void setBirthDay(Date birthDay) {
		this.birth_day = birthDay;
	}

	

}
