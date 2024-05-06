package com.CollegeManagement.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;



@Entity
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer teacherId;
	private String TeacherName;
	private String gender;
	private int age;
	private String address;
	private Double salary;
	
	private String Department;
	
	@ManyToMany
	private List<Student> student = new ArrayList<>();
	
	@OneToMany
	private List<StudentClass> studentClass = new ArrayList<>();

	public Teacher(Integer teacherId, String teacherName, String gender, int age, String address, Double salary,
			String department, List<Student> student, List<StudentClass> studentClass) {
		super();
		this.teacherId = teacherId;
		TeacherName = teacherName;
		this.gender = gender;
		this.age = age;
		this.address = address;
		this.salary = salary;
		Department = department;
		this.student = student;
		this.studentClass = studentClass;
	}

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return TeacherName;
	}

	public void setTeacherName(String teacherName) {
		TeacherName = teacherName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public List<StudentClass> getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(List<StudentClass> studentClass) {
		this.studentClass = studentClass;
	}

	 public Teacher() {
		// 
	}
}
