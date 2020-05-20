package com.Spring.Start.Lessons_12_JDBC;

import com.Spring.Start.Lessons_12_JDBC.Model.Buyer;
import com.Spring.Start.Lessons_12_JDBC.Repo.BuyerrepoJDBC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication()
public class StartJDBC {

	public static void main(String[] args) {

	ApplicationContext ctx = SpringApplication.run(StartJDBC.class, args);

		BuyerrepoJDBC buyerrepoJDBC = ctx.getBean(BuyerrepoJDBC.class);
		buyerrepoJDBC.save(new Buyer(1L,"Andriy","Ukraine",1000));
		buyerrepoJDBC.save(new Buyer(2L,"petro","Ukraine",250));

		// не коректний запис Sql
		// System.out.println(buyerrepoJDBC.findById("1"));
		System.out.println("-------------------------");
		buyerrepoJDBC.findAll().forEach(System.out::println);
		System.out.println("-------------------------");

	}


}

