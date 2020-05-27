package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chenchaofan
 * @date 2020/5/21 - 16:39
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentAppliction8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentAppliction8001.class, args);
    }
}
