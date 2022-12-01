package com.example.firstservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class MyController {
	
	@GetMapping("/message")
	public String getMSg()
	{
		return "this msg is from from service";
	}

}
