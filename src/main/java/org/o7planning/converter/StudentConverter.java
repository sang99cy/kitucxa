package org.o7planning.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.o7planning.dto.StudentDTO;
import org.o7planning.entity.StudentEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class StudentConverter {
	public StudentEntity toEntity(StudentDTO studentDTO) {
		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setCode(studentDTO.getCode());
		studentEntity.setCmt(studentDTO.getCmt());
		if(studentDTO.getBirth_day()!=null) {
			try {
				studentEntity.setBirthDay(new SimpleDateFormat("yyyy-MM-dd").parse(studentDTO.getBirth_day()));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			studentEntity.setBirthDay(null);
		}
		studentEntity.setFullName(studentDTO.getFull_name());
		studentEntity.setHometown(studentDTO.getHometown());
		studentEntity.setNameClass(studentDTO.getName_class());
//		BeanUtils.copyProperties(studentDTO, studentEntity);
		return studentEntity;
	}
	
	public StudentDTO toDTO(StudentEntity studentEntity) {
		StudentDTO studentDTO = new StudentDTO();
		if(studentEntity.getId() != null) {
			studentDTO.setId(studentEntity.getId());
		}
		studentDTO.setCode(studentEntity.getCode());
		studentDTO.setCmt(studentEntity.getCmt());
//		studentDTO.setBirth_day(studentEntity.getBirthDay());
		
		if(studentEntity.getBirthDay()!=null) {
			studentDTO.setBirth_day(new SimpleDateFormat("yyyy-MM-dd").format(studentEntity.getBirthDay()));
		} else {
			studentDTO.setBirth_day(null);
		}
		
		
		studentDTO.setFull_name(studentEntity.getFullName());
		studentDTO.setHometown(studentEntity.getHometown());
		studentDTO.setName_class(studentEntity.getNameClass());
		if(studentEntity.getRoom()==null) {
			studentDTO.setId_room(null);
		} else {
			studentDTO.setId_room(studentEntity.getRoom().getNumberRoom());
		}
		return studentDTO;
	}
	
	public ArrayList<StudentDTO> toListDTO(ArrayList<StudentEntity> studentEntitys) {
		ArrayList<StudentDTO> studentDTOs = new ArrayList<StudentDTO>();
		for(StudentEntity studentEntity: studentEntitys) {
			StudentDTO studentDTO = this.toDTO(studentEntity);
			studentDTOs.add(studentDTO);
		}
		
		return studentDTOs;
	}
	
	public StudentEntity toEntity(StudentDTO studentDTO, StudentEntity studentEntity) {
		studentEntity.setCode(studentDTO.getCode());
		studentEntity.setCmt(studentDTO.getCmt());
		if(studentDTO.getBirth_day()!=null) {
			try {
				studentEntity.setBirthDay(new SimpleDateFormat("yyyy-MM-dd").parse(studentDTO.getBirth_day()));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			studentEntity.setBirthDay(null);
		}
		studentEntity.setFullName(studentDTO.getFull_name());
		studentEntity.setHometown(studentDTO.getHometown());
		studentEntity.setNameClass(studentDTO.getName_class());
		return studentEntity;
	}
}
