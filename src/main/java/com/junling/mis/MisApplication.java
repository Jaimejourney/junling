package com.junling.mis;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScans({
        @MapperScan(basePackages = {"com.junling.mis.mapper.primary"}, sqlSessionFactoryRef = "primarySqlSessionFactory"),
        @MapperScan(basePackages = {"com.junling.mis.mapper.secondary"}, sqlSessionFactoryRef = "secondarySqlSessionFactory")
})
public class MisApplication {

    public static void main(String[] args) {
        SpringApplication.run(MisApplication.class, args);
    }

}
