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

import com.CollegeManagement.Service.ITeacherService;
import com.CollegeManagement.Service.Impl.TeacherServiceImpl;
import com.CollegeManagement.model.Teacher;

@RestController
@RequestMapping
public class TeacherController {
	

	@Autowired 
	private ITeacherService services;

	private static Logger logger = LogManager.getLogger(TeacherServiceImpl.class);
	
	@PostMapping("/teacher")
	public Teacher create(@RequestBody Teacher teach)
	{
		logger.info(" TeacherServiceImpl create()", teach);
		return services.create(teach);
	}
	@GetMapping("/Allteacher")
	public List<Teacher> getAllTeacher(){
		logger.info(" TeacherServiceImpl create()");
		return services.getAllTeacher();
		
	}
	@GetMapping("/teacher/{teacherId}")
	public Optional<Teacher> getById(@PathVariable("teacherId") Long teacherId){
		logger.info(" TeacherServiceImpl getById()", teacherId);
		return services.getById(teacherId);
		
	}
	@DeleteMapping("/deleteTeacher/{teacherId}")
	public void deleteTeacher(@PathVariable("teacherId") Long teacherId) {
		logger.info(" TeacherServiceImpl deleteTeacher()", teacherId);
		services.deleteTeacher(teacherId);
	}
	@PutMapping("/updateTeacher/{teacherId}")
	public Teacher updateTeacher(@PathVariable("teacherId") Long teacherId,@RequestBody Teacher tea) {
		logger.info(" TeacherServiceImpl updateTeacher()", teacherId);
		Teacher t=services.updateById(teacherId);
		t.setAddress(tea.getAddress());
		t.setAge(tea.getAge());
		t.setDepartment(tea.getDepartment());
		t.setGender(tea.getGender());
		t.setSalary(tea.getSalary());
		t.setStudent(tea.getStudent());
		t.setStudentClass(tea.getStudentClass());
		t.setTeacherName(tea.getTeacherName());
		return services.updateTeacher(t);
		
	}
}
