package org.example;
package com.example.pizzeria.controller;

import com.example.pizzeria.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    @GetMapping("/pizzas")
    public String listPizzas(Model model) {
        model.addAttribute("pizzas", pizzaService.getPizzas());
        return "pizzas";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
