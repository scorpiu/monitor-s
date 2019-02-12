package com.ideal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: devoty
 * @Date: 2018/10/17 11:04
 * @Description:
 */

@SpringBootApplication
@MapperScan("com.ideal")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
