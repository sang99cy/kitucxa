package org.o7planning.dto;

import java.util.Date;

import javax.persistence.Column;

public class GuestDTO extends AbtractDTO {

	private String cmt;

	private String full_name;

	private Date birth_day;

	private Long id_student;

	public GuestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCmt() {
		return cmt;
	}

	public void setCmt(String cmt) {
		this.cmt = cmt;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public Date getBirth_day() {
		return birth_day;
	}

	public void setBirth_day(Date birth_day) {
		this.birth_day = birth_day;
	}

	public Long getId_student() {
		return id_student;
	}

	public void setId_student(Long id_student) {
		this.id_student = id_student;
	}

	
	
}
