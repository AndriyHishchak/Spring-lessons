package com.progect.Strong.Starter.Lessons_4_Configuration.Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import outside.Component;

@Configuration
@ComponentScan(basePackages = "outside")
@PropertySource("classpath:application.properties")
public class ConfigurationBean {


    @Bean
    public Component Component(){
        return new Component();
    }
}