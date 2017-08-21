package com.globant.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.globant.entity.Cart;
import com.globant.repository.CartRepository;
import com.globant.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	@Qualifier("cartRepository")
	private CartRepository cartRepository;

	@Override
	public List<Cart> getAllCarts() {
		return cartRepository.findAll();
	}

	@Override
	public Cart addCart(Cart cart) {
		return cartRepository.save(cart);
	}

	@Override
	public Cart updateCart(Cart cart) {
		return cartRepository.save(cart);
	}

	@Override
	public void deleteCart(Long id) {
		cartRepository.delete(id);
	}

	@Override
	public Cart getCartById(Long id) {
		return cartRepository.findOne(id);
	}

}
