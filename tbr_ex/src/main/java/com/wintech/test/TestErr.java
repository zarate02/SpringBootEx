package com.wintech.test;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TestErr implements TestService {

	@Override
	public String hello() {
		log.info("err");
		return "err";
	}

}
