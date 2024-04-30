package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Payment;
import com.example.service.PaymentService;

@RestController
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	
	@PostMapping("/savePayment")
	public Payment callPayment(@RequestBody Payment payment)
	{
		return paymentService.savePayment(payment);
	}
	
	@GetMapping
	public String justCheck()
	{
		return "I am working From Payment";
	}

}
