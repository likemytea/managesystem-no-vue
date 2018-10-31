package com.chenxing.managesystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * .为了适应 ie8，不使用vue的版本
 */

@EnableFeignClients
@SpringBootApplication
@MapperScan("com.chenxing.managesystem.mapper") // 将项目中对应的mapper类
public class ManagesystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagesystemApplication.class, args);
	}
}
