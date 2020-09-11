package com.practice.service.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.service.entity.User;

public interface UserRepository extends JpaRepository<User,String>{


	public List<User> findByaClubUnique(String aClubUnique);
	
}
