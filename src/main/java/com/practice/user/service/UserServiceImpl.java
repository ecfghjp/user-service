package com.practice.user.service;

import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.practice.user.entities.Department;
import com.practice.user.entities.User;
import com.practice.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass().getSimpleName());


	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public User saveUser(User user) {
		logger.info("Inside User service  method save user");
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public ResponseVO findUserById(Long userId) {
		// TODO Auto-generated method stub
		logger.info("Inside User service  method find user");


		User user = userRepository.findByUserId(userId);
		Department department = restTemplate
				.getForObject("http://DEPARTMENT-SERVICE/department/" + user.getUserDepartmentId(), Department.class);
		return new ResponseVO(user, department);
	}

}
