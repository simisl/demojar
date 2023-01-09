package com.jardemo.jarnew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JarnewApplication {


	@RequestMapping(path = "/hell", method = RequestMethod.GET)
	public String hello(){
		return "hello";
	}
	public static void main(String[] args) {
		SpringApplication.run(JarnewApplication.class, args);
	}

}
