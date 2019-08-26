package org.harvan.gradle.gradledemo.entity;

import org.harvan.gradle.gradledemo.entity.model.Order;
import org.harvan.gradle.gradledemo.entity.response.order.OrderResponse;
import org.mapstruct.Mapper;

@Mapper
public interface EntityBeanMapper {

  OrderResponse mapFromModel(Order order);
}
