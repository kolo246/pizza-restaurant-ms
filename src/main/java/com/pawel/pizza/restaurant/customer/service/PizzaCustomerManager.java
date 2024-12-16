package com.pawel.pizza.restaurant.customer.service;

import com.pawel.pizza.restaurant.customer.api.model.PizzaCustomerRegistrationRequest;
import com.pawel.pizza.restaurant.customer.model.RegistrationStatus;

import java.util.UUID;

public interface PizzaCustomerManager {

    RegistrationStatus registerNewCustomer(UUID pizzaCustomerId, PizzaCustomerRegistrationRequest pizzaCustomerRegistrationRequest);
}
