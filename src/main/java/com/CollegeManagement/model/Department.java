package com.CollegeManagement.model;

import javax.persistence.Entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer deptId;
	
	private String deptLocation;
	private String deptName;
	private String deptHod;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@OneToMany
	private List<Student> student = new ArrayList();
	
	@OneToMany
	private List<Teacher> teacher = new ArrayList<>();
	
	public Department(Integer deptId, String deptLocation, String deptName, String deptHod) {
		super();
		this.deptId = deptId;
		this.deptLocation = deptLocation;
		this.deptName = deptName;
		this.deptHod = deptHod;
	}
	
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptLocation() {
		return deptLocation;
	}
	public void setDeptLocation(String deptLocation) {
		this.deptLocation = deptLocation;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptHod() {
		return deptHod;
	}
	public void setDeptHod(String deptHod) {
		this.deptHod = deptHod;
	}
	public Department() {
		
	}
}
