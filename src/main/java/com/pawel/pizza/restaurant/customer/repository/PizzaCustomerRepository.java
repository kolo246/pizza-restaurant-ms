package com.pawel.pizza.restaurant.customer.repository;

import com.pawel.pizza.restaurant.customer.repository.model.PizzaCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface PizzaCustomerRepository extends JpaRepository<PizzaCustomer, UUID> {

    Optional<PizzaCustomer> findByEmailAndPhoneNumber(String email, String phoneNumber);

    PizzaCustomer saveCustomer(PizzaCustomer pizzaCustomer);
}
