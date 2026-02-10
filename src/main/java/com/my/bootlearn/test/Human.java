package com.my.bootlearn.test;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


@Data
@ConfigurationProperties(prefix = "human")
public class Human {
    private String name;
    private int age;
}
