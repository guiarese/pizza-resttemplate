package br.com.pizza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pizza.model.Pizza;
import br.com.pizza.service.PizzaService;

@RestController
@RequestMapping("/pizza")
public class PizzaController {
	
	@Autowired
	public PizzaService pizzaService;
	
	@GetMapping
	public List<Pizza> findAll() {
		return pizzaService.findAll();
	}

}
