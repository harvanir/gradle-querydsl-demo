package org.harvan.gradle.gradledemo.service;

import java.util.List;
import java.util.Optional;
import org.harvan.gradle.gradledemo.entity.response.order.OrderResponse;

public interface OrderService {

  List<OrderResponse> findAll();

  Optional<OrderResponse> findById(Long id);
}
