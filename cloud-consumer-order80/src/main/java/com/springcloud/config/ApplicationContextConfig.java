package com.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenchaofan
 * @date 2020/5/21 - 18:05
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    /**
     * 使用自定义的负载均衡器
     * @return http会话对象
     */
    @Bean
    public RestTemplate restTemplate2(){
        return new RestTemplate();
    }

}
