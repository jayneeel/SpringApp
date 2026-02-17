package com.jayneel.SpringApp;

import com.jayneel.SpringApp.model.Alien;
import com.jayneel.SpringApp.model.Laptop;
import com.jayneel.SpringApp.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringAppApplication.class, args);
//		System.out.println("Hello World");
//		Alien alien = context.getBean(Alien.class);
//		alien.code();

		LaptopService laptopService = context.getBean(LaptopService.class);
		laptopService.addLaptop(new Laptop());

	}

}
