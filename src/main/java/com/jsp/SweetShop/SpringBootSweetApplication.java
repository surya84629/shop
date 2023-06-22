package com.jsp.SweetShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootSweetApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=
				SpringApplication.run(SpringBootSweetApplication.class, args);
	}

}
