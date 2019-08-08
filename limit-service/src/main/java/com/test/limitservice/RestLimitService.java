package com.test.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestLimitService {
	
	@Autowired
	private LimitServiceConfiguration config;
	
	@GetMapping("/limits")
	public LimitServiceDto limit() {
		return new LimitServiceDto(config.getMinimum(),config.getMaximum());
	}
}
