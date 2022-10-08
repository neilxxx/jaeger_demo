package com.seataDemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.seataDemo.entity.UserTestEntity;

@Mapper
@Repository
public interface UserTestMapper extends BaseMapper<UserTestEntity> {

    UserTestEntity getById(int id);
}