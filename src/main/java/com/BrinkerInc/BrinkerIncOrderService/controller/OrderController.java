package com.BrinkerInc.BrinkerIncOrderService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BrinkerInc.BrinkerIncOrderService.dto.OrderDto;
import com.BrinkerInc.BrinkerIncOrderService.dto.OrderFromFE;
import com.BrinkerInc.BrinkerIncOrderService.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	
	@Autowired
	private OrderService service;
	
	
	
	@PostMapping("/saveorderdetails")
	public ResponseEntity<OrderDto> saveOrderDetails(@RequestBody OrderFromFE orderfromfe){
		
		OrderDto orderDetailsToDb = service.addOrderDetailsToDb(orderfromfe);
		
		return new ResponseEntity<>(orderDetailsToDb,HttpStatus.CREATED);
		
	}

}
