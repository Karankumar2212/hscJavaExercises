package com.hughes.SpringBootDemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {
	@RequestMapping("/Greeting")
	public String sayHello1() {
		System.out.println("Greeting controller");
		return "Greeting";
	}
}
