package org.harvanir.gradle.gradledemo.entity;

import org.harvanir.gradle.gradledemo.entity.model.Order;
import org.harvanir.gradle.gradledemo.entity.response.order.OrderResponse;
import org.mapstruct.Mapper;

@Mapper
public interface EntityBeanMapper {

  OrderResponse mapFromModel(Order order);
}
