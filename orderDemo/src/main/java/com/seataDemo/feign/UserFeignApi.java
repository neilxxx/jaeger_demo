package com.seataDemo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "point-service")
public interface UserFeignApi {

    @GetMapping(value = "/updPoint")
    void updPoint();
}
