package com.tang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author shkstart
 * @creat 2019-07-16-20:53
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptProvider8002 {
    public static void main(String[] args)
    {
        SpringApplication.run(DeptProvider8002.class, args);
    }
}
