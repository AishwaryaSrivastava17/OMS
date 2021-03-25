package com.ibm.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ibm.demo.entity.Order;

@Service
public class OrderService { //Spring Beans
	public String createOrder(Order order) {
		return "order created";
	}

public String getOrder() {
	return"order1";
	}
public void updateOrder(int orderId) {
//	return "order updated";
}

public void deleteOrder(int orderId) {
	System.out.println("order deleted");
}

public Order getOrder(int orderId) {
	
	return new Order();
}

public List<Order> getOrders() {
	return new ArrayList<Order>();
//	return null;
}


}
 