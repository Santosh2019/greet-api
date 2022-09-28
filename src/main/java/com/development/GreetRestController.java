package com.development;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {

	@Autowired
	private Environment env;

	@GetMapping("/greet")
	public String getGreetMsg() {

		String str = env.getProperty("server.port");
		
		String msg = "Good Morining......!!!!" + str;

		return msg;

	}

}
