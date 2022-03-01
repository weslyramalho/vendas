package com.wr.venda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wr.venda.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
