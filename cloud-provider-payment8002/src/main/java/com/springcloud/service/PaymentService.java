package com.springcloud.service;


import com.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author  chenchaofan
 */
public interface PaymentService {
    /**
     * 插入支付
     * @param payment 支付信息
     * @return 返回主键
     */
     int create(Payment payment);

    /**
     * 获取支付信息
     * @param id 支付id
     * @return  支付信息
     */
     Payment getPaymentById(@Param("id") Long id);
}
