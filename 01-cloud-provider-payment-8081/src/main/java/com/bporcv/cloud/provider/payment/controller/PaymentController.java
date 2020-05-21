package com.bporcv.cloud.provider.payment.controller;

import com.bporcv.cloud.entity.CommonResult;
import com.bporcv.cloud.entity.Payment;
import com.bporcv.cloud.provider.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Administrator
 * @time 2020/5/16-16:21
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;


    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment) {
        
        int result = paymentService.create(payment);
        return result > 0 ? new CommonResult(200, "新增成功")
                : new CommonResult(500, "新增失败");
    }

    @GetMapping("/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable Long id) {
        Payment payment = paymentService.getPaymentById(id);
        return payment == null ?
                    new CommonResult<Payment>(500,"信息不存在")
                    :
                    new CommonResult<Payment>(200,"查询成功",payment);
    }

}
