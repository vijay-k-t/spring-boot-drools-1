package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DroolsApplication extends SpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DroolsApplication.class, args);
	}

	@GetMapping("/home")
	public String home() {
		return "Drools Application";
	}


	// @Autowired
	// private NewClass newClass;

	// @Override
	// public void run(String... args) throws Exception {
	// 	System.err.println(newClass.getValue());
	// }
}
