package com.globant.service;

import java.util.List;

import com.globant.entity.CartDetail;

public interface CartDetailService {

	List<CartDetail> getAllCartDetails();

	CartDetail addCartDetail(CartDetail cartDetail);

	CartDetail updateCartDetail(CartDetail cartDetail);

	void deleteCartDetail(Long idCartDetail);

	CartDetail getCartDetailById(Long id);

	List<CartDetail> getCartDetailsByCart(Long idCart);

	List<CartDetail> getCartDetailsByUser(Long idUser);

}
