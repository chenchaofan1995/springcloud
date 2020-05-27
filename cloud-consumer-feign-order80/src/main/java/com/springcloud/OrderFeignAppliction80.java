package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author chenchaofan
 * @date 2020/5/25 - 13:17
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignAppliction80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignAppliction80.class,args);
    }
}
