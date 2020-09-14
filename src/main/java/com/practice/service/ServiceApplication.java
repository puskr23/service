package com.practice.service;

import java.util.Map;
import java.util.logging.LogManager;

import org.apache.logging.log4j.Logger;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.practice.service.DTO.Mobileclubillingplans;
import com.practice.service.Repository.DetailRepository;
import com.practice.service.utill.ClubDetails;

@SpringBootApplication
public class ServiceApplication {
	Logger logger=org.apache.logging.log4j.LogManager.getLogger(ServiceApplication.class.getName());      
	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}
	@Component
	class Runner implements CommandLineRunner {
		@Autowired
		DetailRepository repo;
		@Autowired
		ClubDetails details;
		@Override
		public void run(String... args) throws Exception {
			System.out.println("puskar");
			Map<String, String> clubs=details.ServicesMap();
			Map<String, Integer> attempts=details.AttemptsMap();
		for (Mobileclubillingplans user:repo.getMobileAndClubs())
		{
			
			 logger.info("CLUB: {} Number: {} Clubname: {}", user.getAclubunique(), user.getAunique(), clubs.get(user.getAclubunique()));
			 int hit=attempts.get(user.getAclubunique());
			 logger.info("Before Attempt:{}", hit);   
		     if(hit==0) // checks if maximum attempt for respective club is made or not
		  continue;
		if(hit!=0)	 
		 attempts.put(user.getAclubunique(),hit-1);		//for everysucessfull attempt the number of hit in map will be deceased by 1;
		 logger.info("After Attempt:{}", attempts.get(user.getAclubunique())); 
		 System.out.println("======================================");
	
		}
		}
	}
		
	}



