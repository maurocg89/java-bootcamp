package com.globant.service;

import java.util.List;

import com.globant.entity.Stock;

public interface StockService {

	List<Stock> getAllStock();

	Stock addStock(Stock stock);

	Stock updateStock(Stock stock);

	void removeStock(Long id);

	Stock getStockById(Long id);

	Stock getStockByProductId(Long idProduct);

}
