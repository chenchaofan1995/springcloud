package com.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author chenchaofan
 * @date 2020/5/25 - 17:09
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback =PaymentFallbackService.class )
public interface PaymentHystrixService {
    @GetMapping("/payment/hystrix/ok/{id}")
     String paymentInfoOk(@PathVariable("id") Integer id);

    @GetMapping("/payment/hystrix/timeOut/{id}")
    String paymentInfoTimeOut(@PathVariable("id") Integer id);
}
