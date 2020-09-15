package com.practice.service.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.practice.service.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {


	@Query(value = "SELECT aUnique  FROM  mobileclubbillingplans",nativeQuery = true )
    List<String> getUsers();
	
	@Query(value="SELECT * FROM mobileclubbillingplans ORDER BY aClubUnique",nativeQuery=true)
	List<User> findAllByOrder();
}
