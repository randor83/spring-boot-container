package com.docker.example.hello.cont;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	  public String hello() {
	    return "Hello, Kyu!";
	  }
}
