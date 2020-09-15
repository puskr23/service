package com.practice.service;

import com.practice.service.service.UmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;


@SpringBootApplication
public class ServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}
}

@Component
class TestRunner implements CommandLineRunner {
	@Autowired
	UmeService serv;

	public void run(String... strings) throws Exception {
		serv.dotask();
	}

}


