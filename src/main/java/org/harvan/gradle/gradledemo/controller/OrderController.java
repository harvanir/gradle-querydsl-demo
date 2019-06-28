package org.harvan.gradle.gradledemo.controller;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.harvan.gradle.gradledemo.entity.response.order.OrderResponse;
import org.harvan.gradle.gradledemo.exception.NotFoundException;
import org.harvan.gradle.gradledemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

  private OrderService orderService;

  @Autowired
  public void setOrderService(OrderService orderService) {
    this.orderService = orderService;
  }

  @RequestMapping("/id/{id}")
  public OrderResponse findById(@PathVariable @Valid @NotNull Long id) {
    return orderService.findById(id).orElseGet(() -> {
      throw new NotFoundException("Order not found");
    });
  }

  @RequestMapping
  public List<OrderResponse> findAll() {
    return orderService.findAll();
  }
}