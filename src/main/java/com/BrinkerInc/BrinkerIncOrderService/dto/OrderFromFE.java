package com.BrinkerInc.BrinkerIncOrderService.dto;

import java.util.List;

public class OrderFromFE {
	
	private List<FoodItemsDto> foodItems;
	private RestaurantDto restaurant;
	private Integer userId;
	
	
	public List<FoodItemsDto> getFoodItems() {
		return foodItems;
	}
	public void setFoodItems(List<FoodItemsDto> foodItems) {
		this.foodItems = foodItems;
	}
	public RestaurantDto getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(RestaurantDto restaurant) {
		this.restaurant = restaurant;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
