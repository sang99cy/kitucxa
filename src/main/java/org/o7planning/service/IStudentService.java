package org.o7planning.service;

import java.util.ArrayList;
import java.util.List;

import org.o7planning.dto.StudentDTO;
import org.springframework.data.domain.Pageable;

public interface IStudentService {
	StudentDTO save(StudentDTO studentDTO);
	void delete(long[] ids);
	void deleteById(long id);
	ArrayList<StudentDTO> getAll();
	ArrayList<StudentDTO> getStudentByCode(String code);
	StudentDTO getStudentById(Long id);
	List<StudentDTO> findAll(Pageable pageable);
	int totalItem();
}
