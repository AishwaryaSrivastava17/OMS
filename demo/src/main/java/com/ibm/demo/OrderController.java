package com.ibm.demo;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.demo.entity.Order;

@RestController
public class OrderController {//frontend
	@Autowired//is used for DI
	OrderService orderService;   //DI
@PostMapping("/order")
String createOrder(@RequestBody @Valid Order order,BindingResult bindingResult){//,Order price,Order name) {
//String createOrder(@Valid Order order,BindingResult bindingResult) {	
if(bindingResult.hasErrors()) {
	throw new IllegalArgumentException("Something went wrong");
}

	System.out.println(order);
	return orderService.createOrder(order);
}
@GetMapping("/order")
String getOrder() {
	return "order created";
}
@PutMapping("/order/{id}")
String updateOrder(@PathVariable("id")int orderId) {
	System.out.println(orderId);
	return "order updated";

}
@DeleteMapping("/order/{id}")
String deleteOrder(@PathVariable("id")int orderId) {
//System.out.println(httprequest.getHeaders());
	System.out.println(orderId);
	return "order deleted";
}
}
