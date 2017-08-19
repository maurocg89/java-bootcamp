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

import com.globant.entity.CartDetail;
import com.globant.entity.User;
import com.globant.service.CartDetailService;
import com.globant.service.CartService;
import com.globant.service.UserService;

@RestController
@RequestMapping("/cartDetails")
public class CartDetailController {
	
	@Autowired
	@Qualifier("cartDetailServiceImpl")
	private CartDetailService cartDetailService;
	
	@Autowired
	@Qualifier("cartServiceImpl")
	private CartService cartService;
	
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;
	
	
	@GetMapping
	public ResponseEntity<List<CartDetail>> getAllCartsDetails(){
		return new ResponseEntity<List<CartDetail>>(cartDetailService.getAllCartDetails(), HttpStatus.OK);
	}
	
	@GetMapping("/cart/{idCart}")
	public ResponseEntity<List<CartDetail>> getAllCartDetailsByCartId(@PathVariable Long idCart){
		return new ResponseEntity<List<CartDetail>>(cartDetailService.getCartDetailsByCart(idCart), HttpStatus.OK);
	}
	
	@GetMapping("/user/{idUser}")
	public ResponseEntity<String> getAllCartDetailsByUserId(@PathVariable Long idUser){
		User user = userService.getUserById(idUser);
		if (user == null) {
			return new ResponseEntity<String>("There is no user with id: " + idUser, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<String>(cartDetailService.getCartDetailsByUser(idUser).toString(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CartDetail> getCartDetailById(@PathVariable Long id){
		return new ResponseEntity<CartDetail>(cartDetailService.getCartDetailById(id), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<CartDetail> addCartDetail(@RequestBody CartDetail cartDetail){
		return new ResponseEntity<CartDetail>(cartDetailService.addCartDetail(cartDetail), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<String> updateCartDetail(@RequestBody CartDetail cartDetail){
		CartDetail cd = cartDetailService.getCartDetailById(cartDetail.getId());
		if (cd == null) {
			return new ResponseEntity<String>("There is no cart detail with id: " + cartDetail.getId(), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<String>("Cart detail updated: " + cd, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCartDetail(@PathVariable Long id){
		CartDetail cd = cartDetailService.getCartDetailById(id);
		if (cd == null) {
			return new ResponseEntity<String>("There is no cart detail with id: " + id, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<String>("Cart detail deleted: " + cd, HttpStatus.OK);
	}
}
