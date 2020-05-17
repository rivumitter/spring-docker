package com.docker.dockertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerTestApplication {
	
	@GetMapping("/test")
	public String getMsg() {
		
		return "Hello Arghya!!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DockerTestApplication.class, args);
	}

}
