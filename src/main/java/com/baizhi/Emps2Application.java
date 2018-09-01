package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.baizhi.mapper")
public class Emps2Application {

    public static void main(String[] args) {

        SpringApplication.run(Emps2Application.class, args);
    }
}
