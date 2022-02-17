package com.jean.projeto.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.jean.projeto.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long worker, int days) {
		return new Payment("Bob", 200.0, days);
	}

}
