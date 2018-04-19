package com.maventest.heroku.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/heroku")
public class HerokuController {

	@RequestMapping("/test")
	public String testMethod() {
		return "surya";
	}
}
