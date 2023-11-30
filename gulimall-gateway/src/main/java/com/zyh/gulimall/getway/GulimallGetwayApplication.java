package com.zyh.gulimall.getway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/*
* 开启服务注册发现
* */
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GulimallGetwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallGetwayApplication.class, args);
	}

}
