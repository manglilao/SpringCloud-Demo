package com.tang.springcloud;

import com.tang.loadbalance.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author shkstart
 * @creat 2019-07-16-21:43
 */
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration = MyselfRule.class)
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80.class, args);
    }
}
