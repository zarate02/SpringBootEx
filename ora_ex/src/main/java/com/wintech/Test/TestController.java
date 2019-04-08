package com.wintech.Test;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class TestController {
	
	@Resource TestService ts;
	
	@GetMapping("Test001")
	public String Test001() {
		return ts.TestService001();
	}

}
