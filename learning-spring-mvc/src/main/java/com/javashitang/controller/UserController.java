package com.javashitang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class UserController {

	@RequestMapping("user")
	public String index(@RequestParam("name") String name, @RequestParam("age") Integer age) {
		return "username is " + name + "age is " + age;
	}
}
