package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Order;
import com.example.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public Order saveOrder(Order order)
	{
		return  orderRepository.save(order);
	}
	
	
	

}
