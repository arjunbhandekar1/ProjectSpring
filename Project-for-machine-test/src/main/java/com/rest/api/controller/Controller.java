package com.rest.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.api.entity.Order;
import com.rest.api.service.OrderService;

@RestController

public class Controller {

	
	@Autowired
	OrderService orderService;

	@PostMapping("/order/create")
	public ResponseEntity<Order> addOrder(@RequestBody Order o) {
		try {
		Order b = null;
			b= 	this.orderService.addOrders(b);
		ResponseEntity.of(Optional.of(b));
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(o);
		
	}
	@GetMapping("/order/{order_id}")
	public ResponseEntity<Order> getBookById(@PathVariable int  id) {
		Order o=  this.orderService.getOrderById(id);
		if(o==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(o);
		
	}
	@GetMapping("/orders")
	public List<Order> AllOrders(){
		return orderService.getAllOrders();
	}
	
	
	
	
}
