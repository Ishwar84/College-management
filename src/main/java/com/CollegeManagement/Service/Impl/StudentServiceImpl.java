package com.CollegeManagement.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CollegeManagement.Repository.IStudent;
import com.CollegeManagement.Service.IStudentService;
import com.CollegeManagement.model.Student;


@Service
public class StudentServiceImpl implements IStudentService{
	
	@Autowired
	private IStudent  reo;
	private static Logger logger = LogManager.getLogger(StudentServiceImpl.class);

	@Override
	public Student create(Student std) {
		logger.info(" StudentServiceImpl create()", std);		
		return reo.save(std);
	}

	@Override
	public List<Student> getAll() {
		logger.info(" StudentServiceImpl getAll()");
		return reo.findAll();
	}

	@Override
	public void deleteStudent(Long studentId) {
		logger.info(" StudentServiceImpl deleteStudent()", studentId);
		reo.deleteById(studentId);
		
	}

	@Override
	public Optional<Student> getById(Long studentId) {
		logger.info(" StudentServiceImpl getById()", studentId);
		return reo.findById(studentId);
	}

	@Override
	public Student updateStudent(Student std) {
		logger.info(" StudentServiceImpl updateStudent()", std);
		return reo.save(std);
	}

	@Override
	public Student updateById(Long studentId) {
		logger.info(" StudentServiceImpl updateById()", studentId);
		return reo.getById(studentId);
	}


	
	

}
