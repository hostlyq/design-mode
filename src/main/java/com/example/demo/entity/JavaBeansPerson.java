package com.example.demo.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * @author liyq on 2018/11/21
 *
 * 使用JavaBeans模式
 */
@Data
public class JavaBeansPerson {

    //必要参数
    private int id;
    private String name;
    //可选参数
    private int age;
    private String sex;
    private String phone;
    private String address;
    private String desc;

    public static void main(String[] args) {
        JavaBeansPerson person = new JavaBeansPerson();
        person.setId(1);
        person.setName("李四");
        person.setAge(20);
        person.setSex("男");
//        person.setPhone("18800000000");
//        person.setAddress("China");
//        person.setDesc("测试使用JavaBeans模式");
//        System.out.println(person);
        System.out.println(JSONObject.toJSONString(person));
    }
}

