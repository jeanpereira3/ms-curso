package com.jean.projeto.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jean.projeto.hrpayroll.entities.Payment;
import com.jean.projeto.hrpayroll.entities.Worker;
import com.jean.projeto.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {

	@Autowired 
	WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {
		
		Worker worker = workerFeignClient.finlById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
