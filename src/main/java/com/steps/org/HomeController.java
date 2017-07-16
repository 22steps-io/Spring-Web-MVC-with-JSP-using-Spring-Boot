package com.steps.org;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	private String message = "Hello World";

	@RequestMapping(value = "/")
	String home() {
		return "home";
	}

	/*
	 * @RequestMapping(value="/getJson",produces = "application/json")
	 * 
	 * @ResponseBody Object homeJsonResponse(){
	 * System.out.println("Testing live auto restart"); return new
	 * Greeting("Hey Spring Buddy",
	 * "Whoa!, you have created a web app using spring boot! No Thanks"); }
	 */
	@RequestMapping("/jsp")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}
}
