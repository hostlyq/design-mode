package com.example.demo.builder.change;

import com.alibaba.fastjson.JSONObject;

public class ChangeMain {

    public static void main(String[] args) {
        Person person = new Person.Builder(1, "张三")
                .age(18).sex("男").desc("测试使用builder模式").build();
        System.out.println(JSONObject.toJSONString(person));
    }
}
