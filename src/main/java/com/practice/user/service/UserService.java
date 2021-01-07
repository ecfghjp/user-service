package com.practice.user.service;

import org.springframework.stereotype.Service;

import com.practice.user.entities.User;

@Service
public interface UserService {

	User saveUser(User user);

	ResponseVO findUserById(Long userId);

}
