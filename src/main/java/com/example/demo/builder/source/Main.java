package com.example.demo.builder.source;

import com.example.demo.builder.source.entity.Builder;
import com.example.demo.builder.source.entity.ConcreteBuilder1;
import com.example.demo.builder.source.entity.ConcreteBuilder2;
import com.example.demo.builder.source.entity.Product;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder1 = new ConcreteBuilder1();
        Builder builder2 = new ConcreteBuilder2();

        director.construct(builder1);
        Product p1 = builder1.getResult();
        p1.show();

        director.construct(builder2);
        Product p2 = builder2.getResult();
        p2.show();
    }
}
