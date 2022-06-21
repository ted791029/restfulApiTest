package com.api.restfulApiTest.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.api.restfulApiTest.Models.Order;
import com.api.restfulApiTest.Services.OrderService;

@Controller
@RequestMapping("/api/orders")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Order>> all(@RequestParam(value="language_id")String language_id) {
		Order orderExample = new Order();
		orderExample.setLanguage_id(language_id);
		List<Order> orders = orderService.findAll(orderExample);
		return ResponseEntity.status(HttpStatus.OK).body(orders);
	}

}
