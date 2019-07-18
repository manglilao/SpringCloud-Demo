package com.tang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author shkstart
 * @creat 2019-07-18-16:56
 */
@SpringBootApplication
@EnableEurekaServer
public class Config_Git_EurekaServerApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(Config_Git_EurekaServerApplication.class, args);
    }
}
