package org.harvan.gradle.gradledemo.postgresql;

import org.harvan.gradle.gradledemo.entity.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}