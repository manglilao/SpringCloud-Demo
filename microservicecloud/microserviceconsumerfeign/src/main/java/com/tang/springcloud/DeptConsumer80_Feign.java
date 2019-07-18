package com.tang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author shkstart
 * @creat 2019-07-16-21:43
*/
@EnableFeignClients(basePackages= {"com.tang.springcloud"})
@ComponentScan("com.tang.springcloud")
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer80_Feign {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Feign.class, args);
    }
}
