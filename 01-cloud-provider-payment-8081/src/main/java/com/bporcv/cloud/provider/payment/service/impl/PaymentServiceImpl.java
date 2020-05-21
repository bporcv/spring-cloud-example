package com.bporcv.cloud.provider.payment.service.impl;

import com.bporcv.cloud.entity.Payment;
import com.bporcv.cloud.provider.payment.dao.PaymentDao;
import com.bporcv.cloud.provider.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @time 2020/5/16-16:20
 */
@Component
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;


    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
