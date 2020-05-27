package com.springcloud.service;

import com.springcloud.entities.CommonResult;
import com.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author chenchaofan
 * @date 2020/5/25 - 13:20
 */
@Component
@FeignClient("CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {


    /**
     * 获取支付信息
     * @param id 支付id
     * @return  支付信息
     */
    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    /**
     * 测试超时配置
     * @return 端口号
     */
    @GetMapping(value = "/payment/feign/timeout")
    String paymentFeignTimeout();
}
