package com.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practice.service.entity.User;
import com.practice.service.service.UmeService;


@SpringBootApplication
public class ServiceApplication implements CommandLineRunner {
	@Autowired
	UmeService serv;

	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<User> user= serv.findAllByOrder();
		
	}

}
