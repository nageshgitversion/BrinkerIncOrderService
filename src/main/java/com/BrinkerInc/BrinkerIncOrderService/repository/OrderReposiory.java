package com.BrinkerInc.BrinkerIncOrderService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.BrinkerInc.BrinkerIncOrderService.entity.Order;


@Repository
public interface OrderReposiory extends MongoRepository<Order, Integer>{

}
