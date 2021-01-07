package com.practice.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.user.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{


	public User findByUserId(Long userId);

}
