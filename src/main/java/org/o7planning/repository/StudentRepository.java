package org.o7planning.repository;

import java.util.ArrayList;

import org.o7planning.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<StudentEntity, Long>{

	@Query(value="select * from student where student.code= ?", nativeQuery=true)
    ArrayList<StudentEntity> getStudentByCode(String code);
	
}
