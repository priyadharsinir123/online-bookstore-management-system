package com.fxec.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fxec.bookstore.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}