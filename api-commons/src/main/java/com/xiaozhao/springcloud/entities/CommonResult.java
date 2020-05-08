package com.xiaozhao.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Carson_zhao
 * @Date: 2020/5/8 23:21
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T      data;
    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
