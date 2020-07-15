package com.wxf.sc.Eurekademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MyEurekademo {
    public static void main(String[] args) {
        System.out.println("注册中心启动");
        SpringApplication.run(MyEurekademo.class,args);
    }
}
