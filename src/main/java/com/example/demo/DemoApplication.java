package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("hurray")
	public String sayHi()
	{
		return "hi Ajit..welcome SA";
	}

	@GetMapping("hurray2")
	public String sayHi2()
	{
		//added new line in gothub UI
		return "hi Ajit..welcome SA & Cloud---changed in IDE";
		
	}
	@GetMapping("hurray3")
	public String sayHi3()
	{
		//added new line in gothub UI
		return "hi Ajit..welcome SA & Cloud---changed in IDE...";
		
	}
	@GetMapping("openshift")
	public String sayHi3()
	{
		//added new line in gothub UI
		return "hi Ajit..welcome SA & openshift...";
		
	}
	
}
