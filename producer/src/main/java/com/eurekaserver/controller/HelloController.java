package com.eurekaserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ author ezra
 * @ date 2019/3/12 11:38
 */
@RestController
public class HelloController {

	@RequestMapping("/Hello")
	public String index(@RequestParam String name){
		return "hello" + name +", this is first message";
	}

}
