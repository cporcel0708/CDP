package org.example;

import com.example.pizzeria.model.Pizza;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

//@Service
public class PizzaService {

    public List<Pizza> getPizzas() {
        return Arrays.asList(
                new Pizza("Margherita", 8.99),
                new Pizza("Pepperoni", 9.99),
                new Pizza("Hawaiana", 10.99),
                new Pizza("Cuatro Quesos", 11.99),
                new Pizza("Vegetariana", 9.49)
        );
    }
}

