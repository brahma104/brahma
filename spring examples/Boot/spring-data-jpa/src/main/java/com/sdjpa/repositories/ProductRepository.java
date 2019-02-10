package com.sdjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sdjpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
