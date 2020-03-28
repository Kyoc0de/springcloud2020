package com.kyo.springcloud.service;

import com.kyo.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.PropertySource;

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
