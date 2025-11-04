package com.practice.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args)
	{
	     ApplicationContext context = SpringApplication.run(App.class, args);

		 Laptop macbook = context.getBean(Laptop.class);
		 macbook.writeCode();
	}

}
