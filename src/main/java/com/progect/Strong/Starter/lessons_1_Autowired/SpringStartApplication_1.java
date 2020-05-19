package com.progect.Strong.Starter.lessons_1_Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringStartApplication_1 {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringStartApplication_1.class, args);
		//TODO: достаэмо бін із Spring context
		/*Cat cat = (Cat) ctx.getBean("cat");
		System.out.println(cat.sound());
		 */
	}

}
