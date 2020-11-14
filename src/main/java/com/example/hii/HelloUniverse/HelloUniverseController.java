package com.example.hii.HelloUniverse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloUniverseController {

	@GetMapping("/hello")
    public String hello() {
        return "Hello Universe RESTful with Spring Boot";
    } 
}
