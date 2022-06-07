package com.orderService.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderService.model.Order;
import com.orderService.repo.OderRepo;

@Service
public class OrderServiceImpl {

	@Autowired
	private OderRepo oderRepo;

	public String save() {
//		return oderRepo.save(order);

		 return "order service says Hello";
	}

}
