package com.globant.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.globant.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	@Query("Select p from Product p where p.category.name = ?1")
	public List<Product> findProductsByCategory(String category);

	public List<Product> findProductsByName(String name);

}
