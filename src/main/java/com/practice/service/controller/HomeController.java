package com.practice.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practice.service.entity.User;
import com.practice.service.service.UmeService;

@RestController
@RequestMapping("/service")
public class HomeController {
	@Autowired
	private UmeService services;
	
	@RequestMapping(value="/1")
	public String redirect() {
		return"redirect:/getUsers";
	}
	
	
	
	@GetMapping("/getUsers")
	public List<User> getAllUsers() {
		
		return services.getUsers();
	}
	
	@GetMapping("/getUsersByaClubUnique")
	public List<User> getUserByaUnique(String aClubUnique){
				
		return services.getUserByaClubUnique(aClubUnique);
	}
	/*
	public void send() {
		service.mapIniti();
		service.check();

	}*/
	

	
	

}
