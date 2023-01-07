package com.jardemo.jarnew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class JarnewApplication {


	@GetMapping("/txt")
	public String hello(){
		return "hello";
	}
	public static void main(String[] args) {
		SpringApplication.run(JarnewApplication.class, args);
	}

}
