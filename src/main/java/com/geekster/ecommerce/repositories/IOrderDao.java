package com.geekster.ecommerce.repositories;

import com.geekster.ecommerce.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderDao extends JpaRepository<Order,Integer> {

}
