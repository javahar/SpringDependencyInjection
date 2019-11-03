package com.greeting.service.greetings;

import com.greeting.service.greetings.Controller.GreetingsController;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GreetingsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(GreetingsApplication.class, args);

		GreetingsController greetingsController = (GreetingsController) context.getBean("greetingsController");

		greetingsController.sayHello();

	}

}
