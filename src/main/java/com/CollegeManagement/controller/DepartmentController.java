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

import com.CollegeManagement.Service.IDepartmentService;
import com.CollegeManagement.Service.Impl.DepartmentServiceImpl;
import com.CollegeManagement.model.Department;

@RestController
@RequestMapping
public class DepartmentController {
	

	@Autowired 
	private IDepartmentService services;
	
	private static Logger logger = LogManager.getLogger(DepartmentServiceImpl.class);
	
	@PostMapping("/department")
	public Department create(@RequestBody Department dept)
	{
		logger.info(" StudentServiceImpl create()", dept);
		return services.create(dept);
	}	
	@GetMapping("/Alldepartment")
	public List<Department> getAllDepartment(){
		logger.info(" StudentServiceImpl getAllDepartment()");
		return services.getAllDepartment();
		
	}
	@GetMapping("/department/{departmentId}")
	public Optional<Department> getById(@PathVariable("departmentId") Long departmentId){
		logger.info(" StudentServiceImpl getById()", departmentId);
		return services.getById(departmentId);
	}
	@DeleteMapping("/deleteDepartment/{departmentId}")
	public void deleteDepartment(@PathVariable("departmentId") Long departmentId) {
		logger.info(" StudentServiceImpl deleteDepartment()", departmentId);
		services.deleteDepartment(departmentId);
	}
	
	@PutMapping("/updateDepartment/{departmentId}")
	public Department updateDepartment(@PathVariable("departmentId") Long departmentId,@RequestBody Department dept) {
		logger.info(" StudentServiceImpl updateDepartment()", departmentId);
		Department d=services.updateById(departmentId);
		d.setDeptHod(dept.getDeptHod());
		d.setDeptLocation(dept.getDeptLocation());
		d.setDeptName(dept.getDeptName());
		
		return services.updateDepartment(d);
		
	}

}
