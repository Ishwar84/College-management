package com.CollegeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CollegeManagement.model.Teacher;

public interface ITeacherRepository extends JpaRepository<Teacher, Long>{

}
