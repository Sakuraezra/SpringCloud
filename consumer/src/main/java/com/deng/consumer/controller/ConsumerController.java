package com.deng.consumer.controller;

import com.deng.consumer.feignRemote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ author ezra
 * @ date 2019/3/12 14:32
 */

@RestController
public class ConsumerController {

	@Autowired
	HelloRemote helloRemote;


	@RequestMapping("/hello/{name}")
	public String index(@PathVariable("name") String name) {
		return helloRemote.hello(name);
	}


}


