package com.CollegeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CollegeManagement.model.Student;

@Repository
public interface IStudent extends JpaRepository<Student, Long>{

	Student save(Long studentId);


}
