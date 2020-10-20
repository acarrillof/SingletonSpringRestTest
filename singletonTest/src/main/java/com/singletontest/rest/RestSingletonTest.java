package com.singletontest.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.singletontest.service.SingletonTest;

@RestController
public class RestSingletonTest {

	@Autowired
	private SingletonTest singletonTestService;

	@GetMapping("/singleton/{name}")
	public String getSingletonTest(@PathVariable String name) {
		return singletonTestService.getName(name);
	}

}