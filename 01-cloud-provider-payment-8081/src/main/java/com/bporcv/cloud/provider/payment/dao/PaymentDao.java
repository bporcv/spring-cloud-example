package com.bporcv.cloud.provider.payment.dao;

import com.bporcv.cloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @time 2020/5/16-11:53
 */
@Mapper
@Component
public interface PaymentDao {

    int create(@Param("payment") Payment payment);


    Payment getPaymentById(@Param("id") Long id);


}
