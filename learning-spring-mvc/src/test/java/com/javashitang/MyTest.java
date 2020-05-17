package com.javashitang;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.util.AntPathMatcher;

public class MyTest {

	@Test
	public void test1() {
		AntPathMatcher pathMatcher = new AntPathMatcher();
		Assert.assertTrue(pathMatcher.match("/a", "/a"));
		Assert.assertTrue(pathMatcher.match("/index/**", "/index/product/a"));
		Assert.assertTrue(pathMatcher.match("/index/**/a", "/index/product/a"));
	}
}
