package com.wr.venda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wr.venda.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
