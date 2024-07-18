package com.wakefit.ecommerce.repository;

import com.wakefit.ecommerce.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CartRepository extends JpaRepository<Cart, Long> {
    
}
