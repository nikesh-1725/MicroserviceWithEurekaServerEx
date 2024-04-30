package com.example.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Payment;
import com.example.repository.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	public  Payment savePayment(Payment payment)
	{
		
		payment.setTransactionId(UUID.randomUUID().toString());
		payment.setPayStatus(isProcessing());
		return paymentRepository.save(payment);
	}
	
	public String isProcessing()
	{
		return new Random().nextBoolean()?"success":"false";
	}

}
