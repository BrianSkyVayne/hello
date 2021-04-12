package com.test.hello.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @RequestMapping(value = "/hi")
    public String hello(){
        return "Hii";
    }

}
