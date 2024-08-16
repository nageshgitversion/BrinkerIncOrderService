package com.BrinkerInc.BrinkerIncOrderService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.BrinkerInc.BrinkerIncOrderService.dto.OrderDto;
import com.BrinkerInc.BrinkerIncOrderService.dto.OrderFromFE;
import com.BrinkerInc.BrinkerIncOrderService.dto.UserDto;
import com.BrinkerInc.BrinkerIncOrderService.entity.Order;
import com.BrinkerInc.BrinkerIncOrderService.mapper.OrderMapper;
import com.BrinkerInc.BrinkerIncOrderService.repository.OrderReposiory;

@Service
public class OrderService {
	
	@Autowired
	private OrderReposiory repo;
	
	@Autowired
	private OrderSequence sequence;
	
	@Autowired
	private RestTemplate template;
	
	public OrderDto addOrderDetailsToDb(OrderFromFE orderFromFe) {
		
		OrderDto dto = new OrderDto();
		
		int orderId = sequence.generateNextOrderId();
		dto.setOrderId(orderId);
		dto.setFoodItems(orderFromFe.getFoodItems());
		dto.setRestaurantDto(orderFromFe.getRestaurant());
		
		UserDto fecthUserDetails = fecthUserDetails(orderFromFe.getUserId());
		dto.setUserDto(fecthUserDetails);
		
		Order save = repo.save(OrderMapper.INSTANCE.mapOrderDtoToOrder(dto));
		
		return OrderMapper.INSTANCE.mapOrderToOrderDto(save);
		
	 
		
		
		
	}

	private UserDto fecthUserDetails(Integer userId) {
		
		UserDto forObject = template.getForObject("http://BRINKERUSER/user/getuserbyid/"+userId, UserDto.class);
		
		return forObject;
	}

}
