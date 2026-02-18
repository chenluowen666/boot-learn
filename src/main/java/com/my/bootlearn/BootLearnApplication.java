package com.my.bootlearn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.my.bootlearn.dao")
public class BootLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootLearnApplication.class, args);
    }

}
