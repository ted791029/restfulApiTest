package com.api.restfulApiTest.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.api.restfulApiTest.Models.Order;
import com.api.restfulApiTest.Repositories.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll(Order order){
		Example<Order> example = Example.of(order); 
		return orderRepository.findAll(example);
	}
}
