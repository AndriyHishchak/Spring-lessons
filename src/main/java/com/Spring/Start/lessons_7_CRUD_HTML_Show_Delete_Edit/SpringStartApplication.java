package com.Spring.Start.lessons_7_CRUD_HTML_Show_Delete_Edit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication()

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

