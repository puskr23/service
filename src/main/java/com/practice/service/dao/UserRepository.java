package com.practice.service.dao;

import com.practice.service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {


	@Query(value = "SELECT * FROM mobileClubBillingPlans WHERE aUnique:unique", nativeQuery = true)
	List<String> getUsers(@Param("unique") String unique);

	@Query(value = "SELECT *  FROM mobileClubBillingPlans LIMIT 100", nativeQuery = true)
	List<User> findAllByOrder();
}
