package com.springcloud.controller;

import com.springcloud.service.PaymentHystrixService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author chenchaofan
 * @date 2020/5/25 - 16:08
 */
@RestController
public class PaymentController {
    @Resource
    private PaymentHystrixService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfoOk(@PathVariable("id") Integer id) {
        return paymentService.paymentInfoOk(id);
    }

    @GetMapping("/payment/hystrix/timeOut/{id}")
    public String paymentInfoTimeOut(@PathVariable("id") Integer id) {
        return paymentService.paymentInfoTimeOut(id);
    }

    //====服务熔断
    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id)
    {
        String result = paymentService.paymentCircuitBreaker(id);
        System.out.println("****result: "+result);
        return result;
    }
}
