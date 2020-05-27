package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chenchaofan
 * @date 2020/5/21 - 16:39
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentAppliction8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentAppliction8002.class, args);
    }
}
