package com.seataDemo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("user_test")
public class UserTestEntity {

    @TableId(value = "user_id")
    private Integer id;

    private Integer userPoint;

    public Integer getId() {
        return id;
    }

    public UserTestEntity setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getUserPoint() {
        return userPoint;
    }

    public UserTestEntity setUserPoint(Integer userPoint) {
        this.userPoint = userPoint;
        return this;
    }

    @Override
    public String toString() {
        return "UserTestEntity{" +
                "id=" + id +
                ", userPoint=" + userPoint +
                '}';
    }
}
