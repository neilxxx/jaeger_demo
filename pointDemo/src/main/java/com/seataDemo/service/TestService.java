package com.seataDemo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seataDemo.entity.UserTestEntity;
import com.seataDemo.mapper.UserTestMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class TestService extends ServiceImpl<UserTestMapper, UserTestEntity> {

    @Resource
    private UserTestMapper userTestMapper;


    @Transactional
    public void updPoint(){
        UserTestEntity user = new UserTestEntity();
        user.setId(1);
        user.setUserPoint(1000);
        userTestMapper.updateById(user);
    }

    //当本地事务会受全局事务影响 需要使用GlobalLock+Transactional注解争抢全局锁
    //并且查询语句需要增加 for update
    @Transactional
    public UserTestEntity getUser() {

        return userTestMapper.getById(1);
    }
}
