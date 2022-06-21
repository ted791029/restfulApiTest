package com.api.restfulApiTest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.restfulApiTest.Models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
