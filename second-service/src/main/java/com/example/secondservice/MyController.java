package com.example.secondservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class MyController {

	@Value("${server.port}")
	private String port;
	@GetMapping("/message")
	public String getMSg()
	{
		return "this msg is from second service running on port no : "+ port;
	}
}
