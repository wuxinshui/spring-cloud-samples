package com.wxs.feign.provider.vo;

/**
 * @Author: yoyo
 * @Description:
 * @Date: Created in 2019/6/12 10:45
 */
public class UserVo {
    private int age;
    private String name;

    //默认构造函数，Feign JSON->bean
    public UserVo() {
    }

    public UserVo(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
