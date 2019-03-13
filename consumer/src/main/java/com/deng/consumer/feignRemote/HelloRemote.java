package com.deng.consumer.feignRemote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ author ezra
 * @ date 2019/3/12 14:30
 */
@FeignClient(name = "spring-cloud-producer")
public interface HelloRemote {

	@RequestMapping(value = "/hello")
	String hello(@RequestParam(value = "name") String name);
}
