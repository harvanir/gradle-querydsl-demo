package org.harvan.gradle.gradledemo.service.impl;

import static org.harvan.gradle.gradledemo.entity.EntityMapper.MAPPER;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.harvan.gradle.gradledemo.entity.model.QOrder;
import org.harvan.gradle.gradledemo.entity.response.order.OrderResponse;
import org.harvan.gradle.gradledemo.postgresql.OrderRepository;
import org.harvan.gradle.gradledemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

  private OrderRepository orderRepository;

  @Autowired
  public void setOrderRepository(OrderRepository orderRepository) {
    this.orderRepository = orderRepository;
  }

  @Override
  public List<OrderResponse> findAll() {
    QOrder qOrder = QOrder.order;

    return orderRepository.findAll().stream()
        .map(MAPPER::mapFromModel)
        .collect(Collectors.toList());
  }

  @Override
  public Optional<OrderResponse> findById(Long id) {
    return Optional.ofNullable(MAPPER.mapFromModel(orderRepository.findOne(id)));
  }
}
