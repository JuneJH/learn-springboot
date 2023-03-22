package com.june.pojo;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String name;
    private String age;
    private Integer sex;

    public User(String name, String age, Integer sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public User(){
        this.name="June";
        this.age = "十八";
        this.sex = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex=" + sex +
                '}';
    }
}
