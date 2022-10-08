package com.seataDemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.seataDemo.entity.OrderTestEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OrderTestMapper extends BaseMapper<OrderTestEntity> {

}