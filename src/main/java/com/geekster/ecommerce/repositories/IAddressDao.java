package com.geekster.ecommerce.repositories;

import com.geekster.ecommerce.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressDao extends JpaRepository<Address,Integer> {

}
