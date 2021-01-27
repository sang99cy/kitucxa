package org.o7planning.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.o7planning.converter.StudentConverter;
import org.o7planning.dto.StudentDTO;
import org.o7planning.entity.RoomEntity;
import org.o7planning.entity.StudentEntity;
import org.o7planning.repository.RoomRepository;
import org.o7planning.repository.StudentRepository;
import org.o7planning.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {

	@Autowired
	private StudentConverter studentConverter;

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private RoomRepository roomRepository;

	@Override
	public StudentDTO save(StudentDTO studentDTO) {
		StudentEntity studentEntity = new StudentEntity();
		// set room lấy ra id room
		ArrayList<RoomEntity> rooms = roomRepository.getRoomByNumberRoom(studentDTO.getId_room());
		

		// kiểm tra id null phân biệt insert và update
		if (studentDTO.getId() != null) {
			StudentEntity oldStudentEntity = studentRepository.findOne(studentDTO.getId());

			roomRepository.minusNumberPeopleCurrent(oldStudentEntity.getRoom().getId());
			roomRepository.addNumberPeopleCurrent(rooms.get(0).getId());
			studentEntity = studentConverter.toEntity(studentDTO, oldStudentEntity);
		} else {
			roomRepository.addNumberPeopleCurrent(rooms.get(0).getId());
			studentEntity = studentConverter.toEntity(studentDTO);
		}
		// set room
		if (rooms.isEmpty()) {
			studentEntity.setRoom(null);
		} else {
			studentEntity.setRoom(rooms.get(0));
		}

		// hoàn thành entity
		studentEntity = studentRepository.save(studentEntity);
		return studentConverter.toDTO(studentEntity);
	}

	@Override
	public void delete(long[] ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(long id) {
		StudentEntity oldStudentEntity = studentRepository.findOne(id);
		roomRepository.minusNumberPeopleCurrent(oldStudentEntity.getRoom().getId());
		studentRepository.delete(id);

	}

	@Override
	public ArrayList<StudentDTO> getAll() {
		ArrayList<StudentEntity> a = (ArrayList<StudentEntity>) studentRepository.findAll();
		return studentConverter.toListDTO(a);
	}

	@Override
	public ArrayList<StudentDTO> getStudentByCode(String code) {
		ArrayList<StudentEntity> a = (ArrayList<StudentEntity>) studentRepository.getStudentByCode(code);
		return studentConverter.toListDTO(a);
	}

	@Override
	public StudentDTO getStudentById(Long id) {
		try {
			return studentConverter.toDTO(studentRepository.findOne(id));
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<StudentDTO> findAll(Pageable pageable) {
		List<StudentDTO> results = new ArrayList<>();
		List<StudentEntity> entities = studentRepository.findAll(pageable).getContent();
		for(StudentEntity item: entities){
			StudentDTO studentDTO = studentConverter.toDTO(item);
			results.add(studentDTO);
		}
		return results;
	}

	@Override
	public int totalItem() {
		return (int) studentRepository.count();
	}

//	@Override
//	public ArrayList<StudentDTO> getAll() {
//		ArrayList<StudentEntity> a = studentRepository.findAll()
//		return studentConverter.toListDTO();
//	}

}
