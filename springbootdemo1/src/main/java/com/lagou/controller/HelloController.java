package com.lagou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Huw_Lin
 * time: 2022-09-22 14:35
 */

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/boot")
    public String helloBoot(){
        return "Hello Spring Boot";
    }
}
