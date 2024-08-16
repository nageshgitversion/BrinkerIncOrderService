package com.BrinkerInc.BrinkerIncOrderService.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.BrinkerInc.BrinkerIncOrderService.dto.FoodItemsDto;
import com.BrinkerInc.BrinkerIncOrderService.dto.RestaurantDto;
import com.BrinkerInc.BrinkerIncOrderService.dto.UserDto;

import lombok.Data;


@Data
@Document("order")
public class Order {
	
	private Integer orderId;
	private List<FoodItemsDto> foodItems;
	private RestaurantDto restaurantDto;
	private UserDto userDto;
	
	
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public List<FoodItemsDto> getFoodItems() {
		return foodItems;
	}
	public void setFoodItems(List<FoodItemsDto> foodItems) {
		this.foodItems = foodItems;
	}
	public RestaurantDto getRestaurantDto() {
		return restaurantDto;
	}
	public void setRestaurantDto(RestaurantDto restaurantDto) {
		this.restaurantDto = restaurantDto;
	}
	public UserDto getUserDto() {
		return userDto;
	}
	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}
	
	

}
