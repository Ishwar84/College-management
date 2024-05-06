package com.CollegeManagement.Service;

import java.util.List;
import java.util.Optional;

import com.CollegeManagement.model.Department;

public interface IDepartmentService {

	Department create(Department dept);

	List<Department> getAllDepartment();

	void deleteDepartment(Long departmentId);

	Optional<Department> getById(Long departmentId);

	Department updateById(Long departmentId);

	Department updateDepartment(Department d);

}
