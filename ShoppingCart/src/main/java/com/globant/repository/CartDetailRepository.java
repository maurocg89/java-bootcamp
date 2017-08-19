package com.globant.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.globant.entity.CartDetail;

@Repository
public interface CartDetailRepository extends JpaRepository<CartDetail, Long> {

	@Query("Select cd from CartDetail cd where cd.cart.id = ?1")
	public List<CartDetail> findCartDetailByCartId(Long idCart);

	@Query("Select cd from CartDetail cd where cd.cart.user.id = ?1")
	public List<CartDetail> findCartDetailByUserId(Long idUser);
}
