package com.axioma.springsecuritytest.repository;

import com.axioma.springsecuritytest.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
