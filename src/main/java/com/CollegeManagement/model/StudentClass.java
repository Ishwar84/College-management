package com.CollegeManagement.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class StudentClass {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer classId;
	
	private String className;
	
	@OneToMany
	private List<Teacher> teacher = new ArrayList<>();
	
	@OneToMany
	private List<Student> student = new ArrayList<>();
	
	public StudentClass(Integer classId, String className, List<Teacher> teacher, List<Student> student) {
		super();
		this.classId = classId;
		this.className = className;
		this.teacher = teacher;
		this.student = student;
	}
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	

	 public StudentClass() {
		//
	}
		
}
