package com.my.bootlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties(Human.class)
public class BootLearnApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext app = SpringApplication.run(BootLearnApplication.class, args);
        Human bean = app.getBean(Human.class);
        System.out.println(bean);
    }

}
