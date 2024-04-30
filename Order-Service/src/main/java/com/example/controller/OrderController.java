package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Order;
import com.example.service.OrderService;

@RestController
public class OrderController {
	
	
	@Autowired
	private OrderService orderService;
	
	
	@PostMapping("/saveOrders")
	public Order bookOrder(@RequestBody Order order)
	{
		return orderService.saveOrder(order);
	}
	
	
	@GetMapping("/")
	public String justCheck()
	{
		return "i am working";
	}

}
