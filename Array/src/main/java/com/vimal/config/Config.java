package com.vimal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
@ComponentScan(basePackages = "com.vimal")
public class Config {
    @Bean
    public Date getDate() {
        System.out.println( "getDate Called" );
        return new java.util.Date();
    }
}
