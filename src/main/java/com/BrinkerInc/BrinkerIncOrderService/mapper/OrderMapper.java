package com.BrinkerInc.BrinkerIncOrderService.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.BrinkerInc.BrinkerIncOrderService.dto.OrderDto;
import com.BrinkerInc.BrinkerIncOrderService.entity.Order;


@Mapper
public interface OrderMapper {
	
OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
	
	
	Order mapOrderDtoToOrder(OrderDto orderDto);

    

	OrderDto mapOrderToOrderDto(Order order);
}
