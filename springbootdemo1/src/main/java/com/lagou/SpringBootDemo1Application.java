package com.lagou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Huw_Lin
 * time: 2022-09-22 14:39
 * springboot启动类通常放在二级包内，比如 com.lagou.SpringBootDemo1Application
 */

@SpringBootApplication
public class SpringBootDemo1Application {
    public static void main(String[] args) {
        //样板代码
        SpringApplication.run(SpringBootDemo1Application.class,args);
    }
}
