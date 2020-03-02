package com.javashitang.dao;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

@Repository
public class UserDao {

	public UserDao() {
		System.out.println("构造");
	}

	@PostConstruct
	public void init() {
		System.out.println("init");
	}

	public String getUser() {
		return "user";
	}
}
