package org.o7planning.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class StudentDTO extends AbtractDTO {
	private String code;

	private String full_name;

	private String cmt;

//	@DateTimeFormat(iso=ISO.DATE)
	private String birth_day;

	private String name_class;

	private String hometown;

	private String id_room;

	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getCmt() {
		return cmt;
	}

	public void setCmt(String cmt) {
		this.cmt = cmt;
	}

	public String getBirth_day() {
		return birth_day;
	}

	public void setBirth_day(String birth_day) {
		this.birth_day = birth_day;
	}

	public String getName_class() {
		return name_class;
	}

	public void setName_class(String name_class) {
		this.name_class = name_class;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public String getId_room() {
		return id_room;
	}

	public void setId_room(String id_room) {
		this.id_room = id_room;
	}
	
	
	
	
	
}
