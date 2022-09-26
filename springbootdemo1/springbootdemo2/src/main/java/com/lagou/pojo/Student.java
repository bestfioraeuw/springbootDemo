package com.lagou.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Huw_Lin
 * time: 2022-09-22 17:57
 * @Component和@Value注入Person实体类的id属性。其中，@Value不仅可以将配置文件的属性注入Person的id属性，
 * 还可以直接给id属性赋值，这点是@ConfigurationProperties不支持的
 * 但是@value注解不支持注入接口类型，，@Value注解对于包含Map集合、对象以及YAML文件格式的行内式写法的配置文件的属性注入都不支持，
 * 如果赋值会出现错误
 */

@Component
public class Student {
    @Value("$(person.name)")
    private String name;
    @Value("$(person.id")
    private  int number;

//    不支持list这类的接口类型的注入，会报错
//    @Value("$(person.hobby)")
//    private List<String> hobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
