package com.baiyuechu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@MapperScan("com.baiyuechu.dao")
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class BaiyuechuSpringSecurityTaskApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(BaiyuechuSpringSecurityTaskApplication.class, args);
        System.out.println(run);
    }

}
