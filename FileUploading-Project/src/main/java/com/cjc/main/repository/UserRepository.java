package com.cjc.main.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.main.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	
}
