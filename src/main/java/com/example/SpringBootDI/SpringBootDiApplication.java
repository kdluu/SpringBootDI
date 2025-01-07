package com.example.SpringBootDI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDiApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringBootDiApplication.class, args);
		applicationContext.getBean(Dev.class).build();

	}

}
