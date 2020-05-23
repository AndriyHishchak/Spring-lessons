package com.Spring.Start.Lesson_18_Servlet_filter_kyku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication()
@ServletComponentScan
public class SpringStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStartApplication.class, args);
	}
}

