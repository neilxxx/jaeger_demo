package com.seataDemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableDiscoveryClient
@MapperScan("com.seataDemo.mapper")
@EnableFeignClients
@SpringBootApplication
public class PointDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PointDemoApplication.class);
    }
}
