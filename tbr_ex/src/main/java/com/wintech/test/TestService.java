package com.wintech.test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "exora", fallback = TestErr.class)
public interface TestService {
	@RequestMapping(value = "/Test001", method = RequestMethod.GET)
	String hello();
}