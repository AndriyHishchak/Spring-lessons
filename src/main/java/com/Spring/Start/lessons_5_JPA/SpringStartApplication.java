package com.Spring.Start.lessons_5_JPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class SpringStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStartApplication.class, args);
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

