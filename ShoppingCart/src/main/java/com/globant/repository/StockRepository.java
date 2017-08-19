package com.globant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.globant.entity.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long>{
	
	@Query("Select s from Stock s where s.product.id = ?1")
	public Stock findStockByProductId(Long idProduct);

}
