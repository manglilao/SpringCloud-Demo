package com.tang.loadbalance;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author shkstart
 * @creat 2019-07-17-16:46
 */
@Configuration
public class MyselfRule {
    @Bean
    public IRule getIRule(){
        return new RandomRule_Tang();
    }
}
