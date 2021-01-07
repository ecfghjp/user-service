package com.practice.user.controller;

import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.user.entities.User;
import com.practice.user.service.ResponseVO;
import com.practice.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass().getSimpleName());


	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public User saveDepartment(@RequestBody User user) {
		logger.info("Inside User controller method save user");
		return userService.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public ResponseVO findUserById(@PathVariable("id") Long userId) {
		logger.info("Inside User controller method find user");
		return userService.findUserById(userId);
	}
}
