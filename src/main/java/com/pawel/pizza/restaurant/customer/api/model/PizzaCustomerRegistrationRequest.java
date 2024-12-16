package com.pawel.pizza.restaurant.customer.api.model;

public record PizzaCustomerRegistrationRequest(
        String customerName,
        String customerSurname,
        String email,
        String phoneNumber,
        String city,
        String address,
        String postalCode
) {
}
