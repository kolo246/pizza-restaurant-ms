package com.pawel.pizza.restaurant.customer.api;

import com.pawel.pizza.restaurant.customer.api.model.PizzaCustomerRegistrationRequest;
import com.pawel.pizza.restaurant.customer.api.model.PizzaCustomerRegistrationResponse;
import com.pawel.pizza.restaurant.customer.service.PizzaCustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PizzaCustomerController {

    private final PizzaCustomerService pizzaCustomerService;

    @PostMapping
    public ResponseEntity<PizzaCustomerRegistrationResponse> registerPizzaCustomer(
            @RequestBody PizzaCustomerRegistrationRequest pizzaCustomerRegistrationRequest
    ) {
        final PizzaCustomerRegistrationResponse response = pizzaCustomerService.registerCustomer(pizzaCustomerRegistrationRequest);
        return ResponseEntity.ok(response);
    }
}
