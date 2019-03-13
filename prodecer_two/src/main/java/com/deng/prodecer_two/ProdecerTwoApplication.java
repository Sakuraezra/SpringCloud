package com.deng.prodecer_two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
/**
 *
 * create for 负载均衡 = =!
 */
public class ProdecerTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdecerTwoApplication.class, args);
	}

}
