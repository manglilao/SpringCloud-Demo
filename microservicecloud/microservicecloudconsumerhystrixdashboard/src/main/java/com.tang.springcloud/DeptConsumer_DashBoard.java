package com.tang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author shkstart
 * @creat 2019-07-18-8:03
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_DashBoard
{
    public static void main(String[] args)
    {
        SpringApplication.run(DeptConsumer_DashBoard.class,args);
    }
}
