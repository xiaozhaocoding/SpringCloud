package com.xiaozhao.springcloud.service;

import com.xiaozhao.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Carson_zhao
 * @Date: 2020/5/5 0:15
 * @Version 1.0
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
