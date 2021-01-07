package com.practice.user.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	private String userFirstName;
	private String userLastName;
	private Long userDepartmentId;
	private String userEmailId;

	public Long getUserId() {
		return userId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public Long getUserDepartmentId() {
		return userDepartmentId;
	}	

	public String getUserEmailId() {
		return userEmailId;
	}

}
