package com.javashitang.dao;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

@Repository
public class IndexDao2 implements Dao {

	public void query() {
		System.out.println("index3");
	}
}
