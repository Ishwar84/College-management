package com.CollegeManagement.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CollegeManagement.Repository.IStudentClassRepository;
import com.CollegeManagement.Service.IStudentClassService;
import com.CollegeManagement.model.StudentClass;

@Service
public class StudentClassServiceImpl implements IStudentClassService{

	@Autowired
	private IStudentClassRepository  reo;
	
	private static Logger logger = LogManager.getLogger(StudentClassServiceImpl.class);

	@Override
	public StudentClass create(StudentClass std) {
		logger.info("StudentClassServiceImpl create()", std);
		
		return reo.save(std);
	}

	@Override
	public List<StudentClass> getAllclass() {
		logger.info("StudentClassServiceImpl create()");
	
		return reo.findAll();
	}
	@Override
	public Optional<StudentClass> getById(Long classId) {
		logger.info("StudentClassServiceImpl getById()", classId);
		return reo.findById(classId);
	}

	@Override
	public void deleteClasses(Long classId) {
		logger.info("StudentClassServiceImpl deleteClasses()", classId);
		reo.deleteById(classId);
	}

	@Override
	public StudentClass updateById(Long classId) {
		logger.info("StudentClassServiceImpl updateById()", classId);
		return reo.getById(classId);
	}

	@Override
	public StudentClass updateClasses(StudentClass st) {
		logger.info("StudentClassServiceImpl updateClasses()", st);
		return reo.save(st);
	}

	


}
