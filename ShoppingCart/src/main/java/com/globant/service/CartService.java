package com.globant.service;

import java.util.List;

import com.globant.entity.Cart;

public interface CartService {

	List<Cart> getAllCarts();

	Cart addCart(Cart cart);

	Cart updateCart(Cart cart);

	void deleteCart(Long id);

	Cart getCartById(Long id);

}
