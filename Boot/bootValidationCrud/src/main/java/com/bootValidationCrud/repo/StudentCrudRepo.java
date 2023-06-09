package com.bootValidationCrud.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.bootValidationCrud.entity.Student;

public interface StudentCrudRepo extends JpaRepository<Student, Integer>, JpaSpecificationExecutor<Student> {
	// @Query("SELECT s FROM Student s WHERE s.name = :name")

	// List<Student> findByFirstName(String name);

	List<Student> findByName(String name);

	List<Student> findByNameAndSubjectAndStateAndRollNoAndEmailAndSports(String name, String subject, String state,
			String rollNo, String email, String sports);

//	@Query("SELECT s FROM Student s WHERE s.roll_no = :rollNo")
//	List<Student> findByRollNo(@Param("rollNo") String rollNo);

	List<Student> findByRollNo(String rollNo);
}
