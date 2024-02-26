package com.drul.spring;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/order")
public class OrderController {
	@Autowired
	private KieContainer kieContainer;
	
	@PostMapping
	public Order getOrder(@RequestBody Order order) {
		KieSession kieSession = kieContainer.newKieSession();
		kieSession.insert(order);
		kieSession.fireAllRules();
		kieSession.dispose();
		return order;
		
	}
}
