package com.Redhatdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RedhatdemoApplication {
@GetMapping("/")
	public String getmessage(){
		return "THE SPRING PROJECT HAS BEEN DEPLOYED IN REDHAT SUCCESSFULLY";
	}
	@PostMapping("/{name}")
	public String getmessage(@PathVariable String name){
	return "YOUR NAME IS " + name;
	}

	public static void main(String[] args) {
		SpringApplication.run(RedhatdemoApplication.class, args);
	}

}
