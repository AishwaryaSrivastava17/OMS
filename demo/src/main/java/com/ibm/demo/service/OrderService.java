package com.ibm.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.demo.entity.Order;
import com.ibm.demo.repo.OrderRepository;


@Service
public class OrderService { //Spring Beans
	@Autowired
	OrderRepository orderRepository;
	public String createOrder(Order order) {
		Order savedOrder = orderRepository.save(order);
//		return "order created";
		return savedOrder.getId();
	}

public List<Order> getOrders() {
	return orderRepository.findAll();
	}
public void updateOrder(Order order) {
	orderRepository.save(order);
//	return "order updated";
}

public void deleteOrder(String deleteId) {
	orderRepository.deleteById(deleteId);
}

public Optional<Order> getOrder(String orderId) {	
	return orderRepository.findById(orderId);
}

//public List<Order> getOrders() {
//	return new ArrayList<Order>();
//	return null;
//}


}
 