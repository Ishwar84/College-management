package com.CollegeManagement.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.CollegeManagement.Repository.ITeacherRepository;
import com.CollegeManagement.Service.ITeacherService;
import com.CollegeManagement.model.Teacher;

@Service
public class TeacherServiceImpl implements ITeacherService{


	@Autowired
	private ITeacherRepository  reo;

	@Override
	public Teacher create(Teacher teach) {
		
		return reo.save(teach);
	}

	@Override
	public List<Teacher> getAllTeacher() {
		return reo.findAll();
	}
	@Override
	public Optional<Teacher> getById(Long teacherId) {
		return reo.findById(teacherId);
	}

	@Override
	public void deleteTeacher(Long teacherId) {
		reo.deleteById(teacherId);
	}

	@Override
	public Teacher updateById(Long teacherId) {
		return reo.getById(teacherId);
	}

	@Override
	public Teacher updateTeacher(Teacher t) {
		return reo.save(t);
	}

	
}
