package com.ligq.study.mybatis.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@Slf4j
@MapperScan(basePackages = "com.ligq.study.mybatis.demo.dao")
@SpringBootApplication
public class SpringBootMybatisDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisDemoApplication.class, args);
        log.info("----- SpringBootMybatisDemoApplication -----");
    }
}
