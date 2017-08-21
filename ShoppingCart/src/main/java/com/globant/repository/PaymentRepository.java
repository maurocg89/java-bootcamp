package com.globant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.globant.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{

	@Query("Select p from Payment p where p.cart.id=?1")
	Payment findPaymentByCartId(Long idCart);
	
}
