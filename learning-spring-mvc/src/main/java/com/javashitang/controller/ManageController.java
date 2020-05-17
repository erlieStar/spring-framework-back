package com.javashitang.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("manage")
public class ManageController {

	@RequestMapping("product/*")
	public String index() {
		return "product";
	}

	@RequestMapping(value = "user", method = {RequestMethod.GET})
	public String userByGet() {
		return "userByGet";
	}

	@RequestMapping(value = "user", method = {RequestMethod.POST})
	public String userByPost() {
		return "userByPost";
	}
}
