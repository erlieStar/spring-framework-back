package com.javashitang.dependency.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldA {

	@Autowired
	private FieldB fieldB;
}
