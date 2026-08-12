package com.fxec.bookstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fxec.bookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByTitleContainingIgnoreCase(String title);

    List<Book> findByCategoryIgnoreCase(String category);

    List<Book> findByPriceBetween(double min, double max);
}