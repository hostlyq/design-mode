package com.example.demo.builder.source;

import com.example.demo.builder.source.entity.Builder;

public class Director {
    public void construct(Builder builder){
        builder.builderPartA();
        builder.builderPartB();
    }
}
