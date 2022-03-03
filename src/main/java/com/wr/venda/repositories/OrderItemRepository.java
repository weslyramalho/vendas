package com.wr.venda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wr.venda.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
