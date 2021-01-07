package com.practice.user.service;

import com.practice.user.entities.Department;
import com.practice.user.entities.User;

public class ResponseVO {
	private User user;
	private Department department;

	public ResponseVO(User user, Department department) {
		this.user = user;
		this.department = department;
	}


	public User getUser() {
		return user;
	}

	public Department getDepartment() {
		return department;
	}

}
