package com.springcloud.dao;

import com.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * @author chenchaofan
 */
@Mapper
public interface PaymentDao {
     int create(Payment payment);

     Payment getPaymentById2(@Param("id") Long id);
}
