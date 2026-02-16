package com.my.bootlearn.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.web.server.context.WebServerApplicationContext;
import org.springframework.context.ApplicationContext;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.util.Objects;

@Component
public class MyApplicationRunner implements ApplicationRunner {

    private final ApplicationContext applicationContext;

    public MyApplicationRunner(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public void run(@Nullable ApplicationArguments args) throws Exception {
        System.out.println("我的ApplicationRunner");

        // 获取 IP 和端口号
        String ip = InetAddress.getLocalHost().getHostAddress();
        int port = 8080; // 默认端口

        // 如果是 Web 应用，获取实际监听的端口
        if (applicationContext instanceof WebServerApplicationContext) {
            port = Objects.requireNonNull(((WebServerApplicationContext) applicationContext).getWebServer()).getPort();
        }

        System.out.println("=================================================");
        System.out.println("应用启动成功！");
        System.out.println("访问地址: http://" + ip + ":" + port);
        System.out.println("=================================================");
    }
}
