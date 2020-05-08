package com.xiaozhao.springcloud.controller;


import com.xiaozhao.springcloud.entities.CommonResult;
import com.xiaozhao.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: Carson_zhao
 * @Date: 2020/5/5 19:01
 * @Version 1.0
 */
@RestController
@Slf4j
public class OrderController {
    public static final String PAYMENT_URL = "http://PAYMENT-SERVICE";
    @Resource
    private RestTemplate restTemplate;
    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }
}
