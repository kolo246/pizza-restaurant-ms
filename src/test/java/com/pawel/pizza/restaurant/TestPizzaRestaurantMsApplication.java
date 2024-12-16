package com.pawel.pizza.restaurant;

import org.springframework.boot.SpringApplication;

public class TestPizzaRestaurantMsApplication {

	public static void main(String[] args) {
		SpringApplication.from(PizzaRestaurantMsApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
