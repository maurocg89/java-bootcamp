package com.globant.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.globant.entity.CartDetail;
import com.globant.repository.CartDetailRepository;
import com.globant.service.CartDetailService;

@Service
public class CartDetailServiceImpl implements CartDetailService {

	@Autowired
	@Qualifier("cartDetailRepository")
	CartDetailRepository cartDetailRepository;
	
	@Override
	public List<CartDetail> getAllCartDetails() {
		return cartDetailRepository.findAll();
	}

	@Override
	public CartDetail addCartDetail(CartDetail cartDetail) {
		return cartDetailRepository.save(cartDetail);
	}

	@Override
	public CartDetail updateCartDetail(CartDetail cartDetail) {
		return cartDetailRepository.save(cartDetail);
	}

	@Override
	public void deleteCartDetail(Long idCartDetail) {
		cartDetailRepository.delete(idCartDetail);
	}

	@Override
	public CartDetail getCartDetailById(Long id) {
		return cartDetailRepository.findOne(id);
	}

	@Override
	public List<CartDetail> getCartDetailsByCart(Long idCart) {
		return cartDetailRepository.findCartDetailByCartId(idCart);
	}

	@Override
	public List<CartDetail> getCartDetailsByUser(Long idUser) {
		return cartDetailRepository.findCartDetailByUserId(idUser);
	}
	
}
