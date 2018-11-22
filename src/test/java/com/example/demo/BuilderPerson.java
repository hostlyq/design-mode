package com.example.demo;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * @author liyq on 2018/11/21
 */
@Data
public class BuilderPerson {

    //必要参数
    private final int id;
    private final String name;
    //可选参数
    private final int age;
    private final String sex;
    private final String phone;
    private final String address;
    private final String desc;

    private BuilderPerson(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;
        this.phone = builder.phone;
        this.address = builder.address;
        this.desc = builder.desc;
    }

    public static class Builder {
        //必要参数
        private final int id;
        private final String name;
        //可选参数
        private int age;
        private String sex;
        private String phone;
        private String address;
        private String desc;

        public Builder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder age(int val) {
            this.age = val;
            return this;
        }

        public Builder sex(String val) {
            this.sex = val;
            return this;
        }

        public Builder phone(String val) {
            this.phone = val;
            return this;
        }

        public Builder address(String val) {
            this.address = val;
            return this;
        }

        public Builder desc(String val) {
            this.desc = val;
            return this;
        }

        public com.example.demo.entity.BuilderPerson build() {
            return new com.example.demo.entity.BuilderPerson(this);
        }
    }

    public static void main(String[] args) {
        com.example.demo.entity.BuilderPerson person = new com.example.demo.entity.BuilderPerson.Builder(1, "张三")
                .age(18).sex("男").desc("测试使用builder模式").build();
        System.out.println(JSONObject.toJSONString(person));
    }

}
