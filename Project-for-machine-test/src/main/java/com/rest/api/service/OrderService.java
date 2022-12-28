package com.rest.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.api.entity.Order;
import com.rest.api.repository.OrderRepository;

@Service
public class OrderService {

	
	@Autowired
	OrderRepository orderRepository;


	public List<Order> getAllOrders() {

		List<Order> list = (List<Order>) this.orderRepository.findAll();
		return list;
	}

	public Order getOrderById(long id) {
		Optional<Order> b = null;
		try {
			// b = list.stream().filter(e -> e.getId() == id).findFirst().get();
			b =  this.orderRepository.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;



	}

	public Order addOrders(Order b) {
		Order result = (Order) orderRepository.save(b);
		return result;
	}

	
}
