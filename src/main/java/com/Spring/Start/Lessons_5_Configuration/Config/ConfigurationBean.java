package com.Spring.Start.Lessons_5_Configuration.Config;

import com.Spring.Start.outside.Component;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan(basePackages = "outside")
@PropertySource("classpath:application.properties")
public class ConfigurationBean {


    @Bean
    public Component Component(){
        return new Component();
    }
}
