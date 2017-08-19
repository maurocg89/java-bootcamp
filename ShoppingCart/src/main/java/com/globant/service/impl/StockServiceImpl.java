package com.globant.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.globant.entity.Stock;
import com.globant.repository.StockRepository;
import com.globant.service.StockService;

@Service
public class StockServiceImpl implements StockService {

	@Autowired
	@Qualifier("stockRepository")
	private StockRepository stockRepository;
	
	@Override
	public List<Stock> getAllStock() {
		return stockRepository.findAll();
	}

	@Override
	public Stock addStock(Stock stock) {
		return stockRepository.save(stock);
	}

	@Override
	public Stock updateStock(Stock stock) {
		return stockRepository.save(stock);
	}

	@Override
	public void removeStock(Long id) {
		stockRepository.delete(id);	
	}

	@Override
	public Stock getStockById(Long id) {
		return stockRepository.findOne(id);
	}

	@Override
	public Stock getStockByProductId(Long idProduct) {
		return stockRepository.findStockByProductId(idProduct);
	}


}
