package com.CollegeManagement.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CollegeManagement.Repository.IDepartmentRepository;
import com.CollegeManagement.Service.IDepartmentService;
import com.CollegeManagement.model.Department;

@Service
public class DepartmentServiceImpl implements IDepartmentService{
	
	@Autowired
	private IDepartmentRepository  reo;
	private static Logger logger = LogManager.getLogger(DepartmentServiceImpl.class);

	@Override
	public Department create(Department dept) {
		logger.info(" StudentServiceImpl create()", dept);
		
		return reo.save(dept);
	}

	@Override
	public List<Department> getAllDepartment() {
		logger.info(" StudentServiceImpl getAllDepartment()");
	
		return reo.findAll();
	}
	
	@Override
	public Optional<Department> getById(Long departmentId) {
		logger.info(" StudentServiceImpl getById()", departmentId);
		return reo.findById(departmentId);
	}

	@Override
	public void deleteDepartment(Long departmentId) {
		logger.info(" StudentServiceImpl getById()", departmentId);
		reo.deleteById(departmentId);
	}

	@Override
	public Department updateById(Long departmentId) {
		logger.info(" StudentServiceImpl updateById()", departmentId);
		return reo.getById(departmentId);
	}

	@Override
	public Department updateDepartment(Department d) {
		logger.info(" StudentServiceImpl updateDepartment()", d);
		return reo.save(d);
	}

	

}
