package com.CollegeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CollegeManagement.model.Department;

public interface IDepartmentRepository extends JpaRepository<Department, Long> {

}
