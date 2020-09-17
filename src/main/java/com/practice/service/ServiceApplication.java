package com.practice.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
@EnableAsync
public class ServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}

}

//@Component
//class TestRunner extends Thread implements CommandLineRunner {
//	@Autowired
//	UmeService serv;
//
//	@Autowired
//	SerceWithThread serceWithThread;
//
//	public void run(String... strings) throws Exception {
//		//	serv.dotask();
//		serceWithThread.dotask();
//
//	}
//
//}


