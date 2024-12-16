package com.pawel.pizza.restaurant.customer.service;

import com.pawel.pizza.restaurant.customer.api.model.PizzaCustomerRegistrationRequest;
import com.pawel.pizza.restaurant.customer.api.model.PizzaCustomerRegistrationResponse;
import com.pawel.pizza.restaurant.customer.model.RegistrationStatus;
import com.pawel.pizza.restaurant.customer.repository.PizzaCustomerRepository;
import com.pawel.pizza.restaurant.customer.repository.model.PizzaCustomer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PizzaCustomerServiceImpl implements PizzaCustomerService {

    private final PizzaCustomerRepository pizzaCustomerRepository;
    private final PizzaCustomerManager pizzaCustomerManager;

    @Override
    public PizzaCustomerRegistrationResponse registerCustomer(PizzaCustomerRegistrationRequest pizzaCustomerRegistrationRequest) {

        pizzaCustomerRepository.findByEmailAndPhoneNumber(
                pizzaCustomerRegistrationRequest.email(), pizzaCustomerRegistrationRequest.phoneNumber())
                .orElseThrow(() -> new IllegalArgumentException("User already exit under email/phone"));

        final UUID pizzaCustomerId = UUID.randomUUID();
        final RegistrationStatus registrationStatus = pizzaCustomerManager.registerNewCustomer(pizzaCustomerId, pizzaCustomerRegistrationRequest);

        final PizzaCustomer pizzaCustomer = new PizzaCustomer(pizzaCustomerId, pizzaCustomerRegistrationRequest.customerName(),
                pizzaCustomerRegistrationRequest.email(), pizzaCustomerRegistrationRequest.phoneNumber());

        final PizzaCustomer savedCustomer = pizzaCustomerRepository.saveCustomer(pizzaCustomer);

        return new PizzaCustomerRegistrationResponse(savedCustomer.getCustomerId(), savedCustomer.getCustomerName(),
                savedCustomer.getEmail(), registrationStatus);
    }
}
