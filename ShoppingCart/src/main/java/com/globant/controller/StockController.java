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

import com.globant.entity.Stock;
import com.globant.service.StockService;



@RestController
@RequestMapping("/stocks")
public class StockController {
	
	@Autowired
	@Qualifier("stockServiceImpl")
	private StockService stockService;
	
	@GetMapping
	public ResponseEntity<List<Stock>> getAllStocks(){
		return new ResponseEntity<List<Stock>>(stockService.getAllStock(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Stock> getStockById(@PathVariable Long id){
		return new ResponseEntity<Stock>(stockService.getStockById(id), HttpStatus.OK);
	}
	
	@GetMapping("/product/{idProduct}")
	public ResponseEntity<Stock> getStockByProductId(@PathVariable Long idProduct){
		return new ResponseEntity<Stock>(stockService.getStockByProductId(idProduct), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Stock> addStock(@RequestBody Stock stock){
		return new ResponseEntity<Stock>(stockService.addStock(stock), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<String> updateStock(@RequestBody Stock stock){
		Stock s = stockService.getStockById(stock.getId());
		if (s == null) {
			return new ResponseEntity<String>("There is no stock with id: " + stock.getId(), HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<String>("Stock updated: " + s, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteStock(@PathVariable Long id){
		Stock s = stockService.getStockById(id);
		if (s == null) {
			return new ResponseEntity<String>("There is no stock with id: " + id, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<String>("Stock deleted: " + s, HttpStatus.OK);
	}
	
}
