package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductCrudRepository extends CrudRepository<Product, Long> {

//    SELECT * FROM products WHERE product_id = ? order by name asc;

    List<Product> findByCategoryIdOrderByNameAsc(long categoryId);
    Optional<List<Product>> findByStockQuantityLessThanAndState(int stockQuantity, boolean state);
}
