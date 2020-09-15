package com.practice.service.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.service.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	//@Query(value = "SELECT aUnique FROM User", nativeQuery=true)
	//public List<User> selectUser(@Param("aClubUnique") String aClubUnique);
	//@Query(value="Select * from user")
	//public List<User> try1();
	
	public List<User> findAllByaClubUnique(String aClubUnique);
}
