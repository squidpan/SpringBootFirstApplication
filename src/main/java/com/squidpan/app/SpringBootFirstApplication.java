package com.squidpan.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext context=SpringApplication.run(SpringBootFirstApplication.class, args);
        Alien obj = context.getBean(Alien.class);
        obj.code();

        //Laptop laptop = new Laptop();
        //laptop.compile();
	}

}
