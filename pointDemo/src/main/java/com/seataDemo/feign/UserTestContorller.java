package com.seataDemo.feign;

import com.seataDemo.entity.UserTestEntity;
import com.seataDemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserTestContorller {

    @Autowired
    private TestService testService;

    @GetMapping("/updPoint")
    public void updPoint() {

        System.out.println(" point ");

    }

    @GetMapping("/getUser")
    public UserTestEntity getUser() {

        return testService.getUser();

    }

}
