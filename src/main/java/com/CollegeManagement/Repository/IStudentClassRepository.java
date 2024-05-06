package com.CollegeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CollegeManagement.model.StudentClass;

public interface IStudentClassRepository extends JpaRepository<StudentClass, Long>{
}
