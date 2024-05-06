package com.CollegeManagement.Service;

import java.util.List;
import java.util.Optional;

import com.CollegeManagement.model.Student;

public interface IStudentService {

	Student create(Student exer);

	List<Student> getAll();

	void deleteStudent(Long studentId);


	Student updateStudent(Student std);

	Optional<Student> getById(Long studentId);

	Student updateById(Long studentId);


	


}
