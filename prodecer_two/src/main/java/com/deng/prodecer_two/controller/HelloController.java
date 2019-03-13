package com.deng.prodecer_two.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ author ezra
 * @ date 2019/3/12 15:00
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String index(@RequestParam String name) {
		return "hello "+name+"，this is producer 1 send first message";
	}
}
