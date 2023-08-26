package com.baiyuechu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("com.baiyuechu.dao")
public class BaiyuechuSpringSecurityTaskApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(BaiyuechuSpringSecurityTaskApplication.class, args);
        System.out.println(run);
    }

}
