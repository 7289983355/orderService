package com.orderService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orderService.impl.OrderServiceImpl;
import com.orderService.model.Order;

@RestController
@RequestMapping("")
public class OrderController {

	@Autowired
	private OrderServiceImpl orderServiceImpl;

	@PostMapping("/saveOrder")
	public Order save(@RequestBody Order order) {

		return orderServiceImpl.save(order);
	}

}
