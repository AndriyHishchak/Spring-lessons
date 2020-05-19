package com.progect.Strong.Starter.lessons_6_JPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import outside.Component;

@SpringBootApplication
@ComponentScan(basePackages = "outside")
public class SpringStartApplication {

	public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(SpringStartApplication.class, args);
		Component component = (Component) ctx.getBean("component");
		System.out.println(component.learnMe());
	}


	//TODO: CommandLineRunner - виводить усі bean сконфігуровані Spring
	/*@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("Some springs beans:");
			Arrays.stream(ctx.getBeanDefinitionNames()).sorted().forEach(System.out::println);

		};
	}

	 */
}

