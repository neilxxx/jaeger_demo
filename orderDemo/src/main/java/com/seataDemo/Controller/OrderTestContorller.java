package com.seataDemo.Controller;

import com.seataDemo.entity.OrderTestEntity;
import com.seataDemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderTestContorller {

    @Autowired
    private TestService testService;

    @GetMapping("/updOrder")
    public void updOrder(@RequestBody OrderTestEntity req) throws Exception {

        testService.updOrder();

    }


}
