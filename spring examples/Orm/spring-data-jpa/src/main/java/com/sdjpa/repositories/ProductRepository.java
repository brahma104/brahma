package com.sdjpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sdjpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Override
	<S extends Product> S save(S entity);

	@Override
	List<Product> findAll();

	List<Product> findProductByPriceGreaterThan(float price);

	List<Product> findProductByPriceBetween(float minPrice, float maxPrice);

	List<Product> findProductByPriceGreaterThanAndStatus(float price, int status);

	@Query("select p from Product p where p.productName like :productName and p.price >= :price")
	List<Product> getProductsByNameAndPrice(@Param("productName") String productName, @Param("price") float price);

	@Modifying
	@Query("update Product p set p.status = :status where p.productNo = :productNo")
	int updateStatusByProductId(@Param("productNo") int productNo, @Param("status") int status);

	int countProductsByStatus(int status);
}




















