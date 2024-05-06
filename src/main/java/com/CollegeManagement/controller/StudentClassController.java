package com.CollegeManagement.controller;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CollegeManagement.Service.IStudentClassService;
import com.CollegeManagement.Service.Impl.StudentClassServiceImpl;
import com.CollegeManagement.model.StudentClass;

@RestController
@RequestMapping
public class StudentClassController {
	
	
	@Autowired 
	private IStudentClassService services;	

	private static Logger logger = LogManager.getLogger(StudentClassServiceImpl.class);
	
	
	@PostMapping("/class")
	public StudentClass create(@RequestBody StudentClass std){
		logger.info(" StudentClassServiceImpl create()", std);
		return services.create(std);
		
	}
	@GetMapping("/Allclass")
	public List<StudentClass> getAllclass(){
		logger.info(" StudentClassServiceImpl getAllclass()");
		return services.getAllclass();
	}
	@GetMapping("/class/{classId}")
	public Optional<StudentClass> getById(@PathVariable("classId") Long classId){
		logger.info(" StudentClassServiceImpl getById()", classId);
		return services.getById(classId);
		
	}
	@DeleteMapping("/deleteClasses{}")
	public void deleteClasses(@PathVariable("classId") Long classId) {
		logger.info(" StudentClassServiceImpl deleteClasses()", classId);
		services.deleteClasses(classId);
	}
	@PutMapping("/updateclasses/{classId}")
	public StudentClass updateClasses(@PathVariable("classId") Long classId,@RequestBody StudentClass std) {
		logger.info(" StudentClassServiceImpl updateClasses()", classId);
		StudentClass st=services.updateById(classId);
		st.setClassName(std.getClassName());
		return services.updateClasses(st);
		
	}
}
