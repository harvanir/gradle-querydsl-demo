package org.harvan.gradle.gradledemo.controller;

import org.harvan.gradle.gradledemo.entity.model.Order;
import org.harvan.gradle.gradledemo.entity.response.order.OrderResponse;
import org.mapstruct.Mapper;

@Mapper
public interface WebBeanMapper {

  OrderResponse mapFromModel(Order order);
}