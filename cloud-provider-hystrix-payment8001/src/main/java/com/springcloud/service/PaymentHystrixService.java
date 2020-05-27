package com.springcloud.service;

/**
 * @author chenchaofan
 * @date 2020/5/25 - 16:03
 */
public interface PaymentHystrixService {
    /**
     * 正常访问ok的方法
     * @param id id
     * @return 正常信息
     */
    String paymentInfoOk(Integer id);

    String paymentInfoTimeOut(Integer id);
     String paymentCircuitBreaker(Integer id);

}
