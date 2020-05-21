package com.bporcv.cloud.provider.payment.service;


import com.bporcv.cloud.entity.Payment;

/**
 * @ClassName PaymentService
 * @Description // TODO
 * @Author Administrator
 * @Date 2020/5/16 16:19
 * @Version 1.0
 */
public interface PaymentService {

    int create(Payment payment);


    Payment getPaymentById(Long id);
}
