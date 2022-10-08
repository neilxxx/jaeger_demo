package com.seataDemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalField;
import java.util.Date;
import java.util.Locale;

@TableName("order_test")
public class OrderTestEntity {

    @TableId(value = "order_id")
    private Long id;

    private String orderStatus;


    public Long getId() {
        return id;
    }

    public OrderTestEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public OrderTestEntity setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

}
