package com.xiaozhao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: Carson_zhao
 * @Date: 2020/5/8 19:52
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7011 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7011.class,args);
    }
}
