package com.globant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globant.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long>{

}
