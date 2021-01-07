package com.practice.user.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getDepartmentId() {
		return departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public String getDepartmentAddress() {
		return departmentAddress;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
}
