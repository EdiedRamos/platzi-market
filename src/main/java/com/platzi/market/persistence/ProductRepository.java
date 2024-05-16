package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ProductCrudRepository;
import com.platzi.market.persistence.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
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

    public Optional<Product> getProduct(long productId) {
        return productCrudRepository.findById(productId);
    }

    public Product saveProduct(Product product) {
        return productCrudRepository.save(product);
    }

    public void deleteProduct(long productId) {
        productCrudRepository.deleteById(productId);
    }
}
