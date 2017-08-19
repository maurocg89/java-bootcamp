package com.globant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globant.entity.Cart;
import com.globant.service.CartService;

@RestController
@RequestMapping("/carts")
public class CartController {
	
	@Autowired
	@Qualifier("cartServiceImpl")
	private CartService cartService;
	
	@GetMapping
	public ResponseEntity<List<Cart>> getAllCarts(){
		return new ResponseEntity<List<Cart>>(cartService.getAllCarts(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cart> getCartById(@PathVariable Long id){
		return new ResponseEntity<Cart>(cartService.getCartById(id), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Cart> addCart(@RequestBody Cart cart){
		return new ResponseEntity<Cart>(cartService.addCart(cart), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<String> updateCart(@RequestBody Cart cart){
		Cart c = cartService.getCartById(cart.getId());
		if (c == null) {
			return new ResponseEntity<String>("There is no cart with id: " + cart.getId(), HttpStatus.BAD_REQUEST);
		}
		cartService.updateCart(cart);
		return new ResponseEntity<String>("Cart updated: " + cart, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCart(@PathVariable Long id){
		Cart c = cartService.getCartById(id);
		if (c == null) {
			return new ResponseEntity<String>("There is no cart with id: " + id, HttpStatus.BAD_REQUEST);
		}
		cartService.deleteCart(id);
		return new ResponseEntity<String>("Cart deleted: " + c, HttpStatus.OK);
	}
}
