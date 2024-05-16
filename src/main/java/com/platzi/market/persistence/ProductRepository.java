package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ProductCrudRepository;
import com.platzi.market.persistence.entity.Product;

import java.util.List;
import java.util.Optional;

public class ProductRepository {
    private final ProductCrudRepository productCrudRepository;

    public ProductRepository(ProductCrudRepository productCrudRepository) {
        this.productCrudRepository = productCrudRepository;
    }

    public List<Product> getAll() {
        return (List<Product>) productCrudRepository.findAll();
    }

    public List<Product> getByCategory(long categoryId) {
        return productCrudRepository.findByCategoryIdOrderByNameAsc(categoryId);
    }

    public Optional<List<Product>> getFewStock(int stockQuantity) {
        return productCrudRepository.findByStockQuantityLessThanAndState(stockQuantity, true);
    }
}
