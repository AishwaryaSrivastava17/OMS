package com.ibm.demo;

import org.springframework.stereotype.Service;

import com.ibm.demo.entity.Order;

@Service
public class OrderService {
public String createOrder(Order order) {
	return"order created";
}
//public String getOrder(Order order) {
//	return"order created";
//}
}