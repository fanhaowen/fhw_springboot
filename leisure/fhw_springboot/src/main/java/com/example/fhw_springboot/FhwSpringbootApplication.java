package com.example.fhw_springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.example.fhw_springboot.Dao")
@EnableScheduling
public class FhwSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(FhwSpringbootApplication.class, args);
        System.out.println();
    }

}
