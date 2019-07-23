package com.kayak.example.web;

import com.kayak.example.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ribbon")
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("hello")
    public String getHello(){
        return helloService.hello();
    }

    @GetMapping("/test")
    public String getDemo(){
        return "成功";
    }
}
