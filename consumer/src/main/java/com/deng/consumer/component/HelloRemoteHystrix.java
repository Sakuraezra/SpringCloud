package com.deng.consumer.component;

import com.deng.consumer.feignRemote.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ author ezra
 * @ date 2019/3/13 16:43
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {

	@Override
	public String hello(@RequestParam(value = "name")String name)
	{
		return "hello " + name + " , this message send failed";
	}

}
