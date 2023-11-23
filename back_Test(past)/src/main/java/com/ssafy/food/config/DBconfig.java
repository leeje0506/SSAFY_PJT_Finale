package com.ssafy.food.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.ssafy.food.model.dao")
public class DBconfig {
    
}
