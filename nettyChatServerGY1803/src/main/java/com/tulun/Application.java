package com.tulun;


import com.tulun.controller.MyHttpClient;
import com.tulun.netty.NettyServer;
import com.tulun.util.SpringUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import javax.swing.*;

@Import(SpringUtil.class)
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);

        NettyServer bean = run.getBean(NettyServer.class);

        bean.init();



}

}
