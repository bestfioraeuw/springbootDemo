package com.lagou.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author Huw_Lin
 * time: 2022-09-22 17:34
 * 配置文件中的信息注入
 * prefix的名字必须和类名一致
 * 必须有相对应的set方法
 * 1
 */
@Component
@ConfigurationProperties(prefix = "person")
public class person {
    private int id; //id
    private String name; //名称
    private List hobby; //爱好
    private String[] family; //家庭成员
    private Map map;
    private pet pet; //宠物

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobby() {
        return hobby;
    }

    public void setHobby(List hobby) {
        this.hobby = hobby;
    }

    public String[] getFamily() {
        return family;
    }

    public void setFamily(String[] family) {
        this.family = family;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public com.lagou.pojo.pet getPet() {
        return pet;
    }

    public void setPet(com.lagou.pojo.pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobby=" + hobby +
                ", family=" + Arrays.toString(family) +
                ", map=" + map +
                ", pet=" + pet +
                '}';
    }
}
