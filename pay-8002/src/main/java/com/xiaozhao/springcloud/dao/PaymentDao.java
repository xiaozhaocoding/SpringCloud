package com.xiaozhao.springcloud.dao;

import com.xiaozhao.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Carson_zhao
 * @Date: 2020/5/4 23:54
 * @Version 1.0
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
