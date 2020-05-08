package com.xiaozhao.springcloud.service.impl;

import com.xiaozhao.springcloud.dao.PaymentDao;
import com.xiaozhao.springcloud.entities.Payment;
import com.xiaozhao.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Carson_zhao
 * @Date: 2020/5/5 0:16
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
