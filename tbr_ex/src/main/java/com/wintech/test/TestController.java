package com.wintech.test;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Resource TestService ts;
	
	@RequestMapping("Test001")
	public String test001() {
		return ts.hello();
	}

}