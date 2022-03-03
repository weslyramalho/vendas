package com.wr.venda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wr.venda.entities.Category;
import com.wr.venda.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
