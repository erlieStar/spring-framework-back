package com.javashitang.config;

import com.javashitang.controller.AddressController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

import java.util.HashMap;
import java.util.Map;

//@Configuration
public class HandlerMappingConfig {

	@Autowired
	private AddressController addressController;

	@Bean
	public SimpleUrlHandlerMapping simpleUrlHandlerMapping() {
		SimpleUrlHandlerMapping mapping = new SimpleUrlHandlerMapping();
		Map<String, Object> urlMap = new HashMap<>();
		urlMap.put("/addressV2", addressController);
		urlMap.put("/indexV2", "indexController");
		mapping.setUrlMap(urlMap);
		return mapping;
	}
}
