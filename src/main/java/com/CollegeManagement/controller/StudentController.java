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

import com.CollegeManagement.Service.IStudentService;
import com.CollegeManagement.Service.Impl.StudentServiceImpl;
import com.CollegeManagement.model.Student;


@RestController
@RequestMapping
public class StudentController {
	
	
	@Autowired 
	private IStudentService services;
	private static Logger logger = LogManager.getLogger(StudentServiceImpl.class);
	
	@PostMapping("/student")
	public Student create(@RequestBody Student std)
	{
		logger.info(" StudentServiceImpl create()", std);
		return services.create(std);
		
	}
	@GetMapping("/allstudent")
	public List<Student> getAll(){
		logger.info(" StudentServiceImpl getAll()");
		return services.getAll();
		
	}
	@GetMapping("/student/{studentId}")
	public Optional<Student> getById(@PathVariable("studentId") Long studentId){
		logger.info(" StudentServiceImpl getById()", studentId);
		return services.getById(studentId);
		
	}
	
	@DeleteMapping("/deletestudent/{studentId}")
	public void deleteStudent(@PathVariable ("studentId") Long studentId) {
		logger.info(" StudentServiceImpl deleteStudent()", studentId);
		services.deleteStudent(studentId);
	}
	@PutMapping("student/{studentId}")
	public Student updateStudent(@PathVariable("studentId") Long studentId,@RequestBody Student std) {
		logger.info(" StudentServiceImpl updateStudent()", studentId);
		Student st=services.updateById(studentId);
		st.setClassId(std.getClassId());
		st.setClassNumber(std.getClassNumber());
		st.setStudentName(std.getStudentName());
		st.setTeacher(std.getTeacher());
		return services.updateStudent(st);
	}
	
	
}
