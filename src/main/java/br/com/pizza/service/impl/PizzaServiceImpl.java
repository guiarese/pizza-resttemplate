package br.com.pizza.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.pizza.model.Pizza;
import br.com.pizza.service.PizzaService;

@Service
public class PizzaServiceImpl implements PizzaService {
	
	@Autowired
	public RestTemplate restTemplate;

	@Override
	public List<Pizza> findAll() {
		ResponseEntity<List<Pizza>> pizzaResponse = 
				restTemplate.exchange("https://order-pizza-api.herokuapp.com/api/orders",
									  HttpMethod.GET,
									  null,
									  new ParameterizedTypeReference <List<Pizza>>() {}); //lista fortemente tipada
		List<Pizza> pizzaList = pizzaResponse.getBody();
		return pizzaList;
				
	}

}
