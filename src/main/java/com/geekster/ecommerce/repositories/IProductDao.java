package com.geekster.ecommerce.repositories;

import com.geekster.ecommerce.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IProductDao extends JpaRepository<Product,Integer> {
    @Query(name = "Select * from Products where category = :category ",nativeQuery = true)
    Optional<Product> findProductByCategory(String category);
}
