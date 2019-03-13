package com.deng.consumer.feignRemote;

import com.deng.consumer.component.HelloRemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ author ezra  consumer fisrt create for Demo
 * @ date 2019/3/12 14:30
 */
/*
@FeignClient(name = "spring-cloud-producer")
public interface HelloRemote {

	@RequestMapping(value = "/hello")
	String hello(@RequestParam(value = "name") String name);
}
*/

/**
 * @ author ezra  consumer second create for Hystrix
 * @ date 2019/3/12 14:30
 */
@FeignClient(name = "spring-cloud-producer",fallback = HelloRemoteHystrix.class)
public  interface HelloRemote{

	@RequestMapping(value = "/hello")
	public String hello(@RequestParam(value = "name")String  name);
}