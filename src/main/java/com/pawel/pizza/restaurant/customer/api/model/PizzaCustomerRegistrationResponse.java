package com.pawel.pizza.restaurant.customer.api.model;

import com.pawel.pizza.restaurant.customer.model.RegistrationStatus;

import java.util.UUID;

public record PizzaCustomerRegistrationResponse(
        UUID pizzaCustomerId,
        String customerName,
        String email,
        RegistrationStatus registrationStatus
) {
}
