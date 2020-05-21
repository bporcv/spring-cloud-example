package com.bporcv.cloud.consumer.order.controller;

import com.bporcv.cloud.consumer.order.entity.CommonResult;
import com.bporcv.cloud.consumer.order.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

/**
 * 主题：
 *
 * <p>
 * 代码解释：
 * <p>
 * 预期结果：
 * <p>
 * 解决方案：
 */
@RestController
@RequestMapping("/consumer/payment")
public class ConsumerOrderController {

    public static final String PAYMENT_URL = "http://localhost:8081/payment/";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/create")
    public CommonResult create(Payment payment, HttpServletRequest request) {
        CommonResult result = restTemplate.postForObject(PAYMENT_URL + "create", payment, CommonResult.class);
        return result;
    }

    @GetMapping("/get/{id}")
    public CommonResult<Payment> get(@PathVariable Long id, HttpServletRequest request) {
        CommonResult result = restTemplate.getForObject(PAYMENT_URL + "get/" + id, CommonResult.class);
        return result;
    }


}
