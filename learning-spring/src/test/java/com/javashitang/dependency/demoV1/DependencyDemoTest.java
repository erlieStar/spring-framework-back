package com.javashitang.dependency.demoV1;

import org.junit.Test;

import static org.junit.Assert.*;

public class DependencyDemoTest {

	@Test
	public void demo1() throws Exception {
		DependencyDemo dependencyDemo = new DependencyDemo();
		// 假装扫描出来的对象
		Class[] classes = {A.class, B.class};
		// 假装项目初始化实例化所有bean
		for (Class aClass : classes) {
			dependencyDemo.getBean(aClass);
		}
		// true
		System.out.println(dependencyDemo.getBean(B.class).getA() == dependencyDemo.getBean(A.class));
		// true
		System.out.println(dependencyDemo.getBean(A.class).getB() == dependencyDemo.getBean(B.class));
	}
}