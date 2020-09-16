package com.practice.service.dao;

import com.practice.service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {


	@Query(value = "SELECT aUnique  FROM  mobileclubbillingplans",nativeQuery = true )
    List<String> getUsers();

	@Query(value = "SELECT * FROM mobileclubbillingplans ", nativeQuery = true)
	List<User> findAllByOrder();
}
