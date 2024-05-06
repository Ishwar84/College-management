package com.CollegeManagement.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentId;
	private String studentName;
	private int classNumber;
	
	@OneToOne
	private StudentClass classs;
	
	@OneToMany
	private List<Teacher> teacher = new ArrayList<>();

	public Student(Long studentId, String studentName, int classNumber, StudentClass classs,
			List<Teacher> teacher) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.classNumber = classNumber;
		this.classs = classs;
		this.teacher = teacher;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

	public StudentClass getClassId() {
		return classs;
	}

	public void setClassId(StudentClass classs) {
		this.classs = classs;
	}

	public List<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}

	public Student(){
		   // Add here init stuff if needed
		}
}
