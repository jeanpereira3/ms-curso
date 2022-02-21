package com.jean.projeto.hrpayroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jean.projeto.hrpayroll.entities.Payment;
import com.jean.projeto.hrpayroll.services.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@RestController
@RequestMapping(value = "/payments")
public class PaymentResource  {


	@Autowired
	private PaymentService service;

	@HystrixCommand(fallbackMethod = "getPaymentAlternative")
	@GetMapping(value = "/{workerId}/days/{dias}")
	public ResponseEntity<Payment> getPayment(@PathVariable long workerId, @PathVariable int dias) {
		Payment payment = service.getPayment(workerId, dias);
		return ResponseEntity.ok(payment);
	}

	public ResponseEntity<Payment> getPaymentAlternative(long workerId, int dias, Throwable t) {
		Payment payment = new Payment("Bran", 400.0, dias);
		return ResponseEntity.ok(payment);
	}

}
