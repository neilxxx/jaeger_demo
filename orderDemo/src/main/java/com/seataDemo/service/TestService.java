package com.seataDemo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seataDemo.entity.OrderTestEntity;
import com.seataDemo.feign.UserFeignApi;
import com.seataDemo.mapper.OrderTestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestService extends ServiceImpl<OrderTestMapper, OrderTestEntity> {

    @Resource
    private OrderTestMapper orderTestMapper;

    @Resource
    private UserFeignApi userFeignApi;


    public void updOrder() throws Exception {

        System.out.println(" order ");
        //远程调用feign 修改用户积分 1--》 1000
        userFeignApi.updPoint();

    }


}
