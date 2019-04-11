package com.wintech.Test;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class TestController {
	
	@Resource TestService ts;
	
	@GetMapping("TestSelect")
	public List<Map<String,Object>> TestSelect(@RequestBody Map<String,Object> parm) {
		log.info("call TestSelect : "+ parm);
		return ts.TestSelect(parm);
	}
	
	@PostMapping("TestInsert")
	public String TestInsert(@RequestBody Map<String,Object> parm) {
		log.info("call TestInsert");
		return ts.TestInsert(parm);
	}
	
	@PatchMapping("TestUpdate")
	public String TestUpdate(@RequestBody Map<String,Object> parm) {
		log.info("call TestUpdate");
		return ts.TestUpdate(parm);
	}

	@DeleteMapping("TestDelete")
	public String TestDelete(@RequestBody Map<String,Object> parm) {
		log.info("call TestDelete");
		return ts.TestDelete(parm);
	}

}
