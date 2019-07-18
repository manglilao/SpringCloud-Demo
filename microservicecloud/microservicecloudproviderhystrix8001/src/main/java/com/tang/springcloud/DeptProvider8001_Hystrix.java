package com.tang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author shkstart
 * @creat 2019-07-16-20:53
 */
@EnableCircuitBreaker//对hystrixR熔断机制的支持
@SpringBootApplication
@EnableEurekaClient
public class DeptProvider8001_Hystrix {
    public static void main(String[] args)
    {
        SpringApplication.run(DeptProvider8001_Hystrix.class, args);
    }
}
