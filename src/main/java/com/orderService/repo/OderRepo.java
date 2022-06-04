package com.orderService.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderService.model.Order;

public interface OderRepo extends JpaRepository<Order, Integer>{

}
