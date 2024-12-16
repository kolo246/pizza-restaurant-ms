package com.pawel.pizza.restaurant.customer.service;

import com.pawel.pizza.restaurant.customer.api.model.PizzaCustomerRegistrationRequest;
import com.pawel.pizza.restaurant.customer.api.model.PizzaCustomerRegistrationResponse;

public interface PizzaCustomerService {

    PizzaCustomerRegistrationResponse registerCustomer(PizzaCustomerRegistrationRequest pizzaCustomerRegistrationRequest);
}
