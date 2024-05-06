package com.CollegeManagement.Service;

import java.util.List;
import java.util.Optional;

import com.CollegeManagement.model.Teacher;

public interface ITeacherService {

	Teacher create(Teacher teach);

	List<Teacher> getAllTeacher();

	void deleteTeacher(Long teacherId);

	Optional<Teacher> getById(Long teacherId);

	Teacher updateById(Long teacherId);

	Teacher updateTeacher(Teacher t);

}
