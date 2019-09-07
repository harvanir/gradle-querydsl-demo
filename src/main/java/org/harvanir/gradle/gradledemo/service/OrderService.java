package org.harvanir.gradle.gradledemo.service;

import java.util.List;
import java.util.Optional;
import org.harvanir.gradle.gradledemo.entity.response.order.OrderResponse;

public interface OrderService {

  List<OrderResponse> findAll();

  Optional<OrderResponse> findById(Long id);
}
