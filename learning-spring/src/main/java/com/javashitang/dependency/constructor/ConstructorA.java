package com.javashitang.dependency.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ConstructorA {

	private ConstructorB constructorB;

	@Autowired
	public ConstructorA(ConstructorB constructorB) {
		this.constructorB = constructorB;
	}
}
