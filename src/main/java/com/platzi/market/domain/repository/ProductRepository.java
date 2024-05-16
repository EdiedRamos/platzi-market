package com.platzi.market.domain.repository;

import com.platzi.market.domain.DomainProduct;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<DomainProduct> getAll();
    List<DomainProduct> getByCategory(long categoryId);
    Optional<List<DomainProduct>> getFewStock(int quantity);
    Optional<DomainProduct> getProduct(long productId);
    DomainProduct saveProduct(DomainProduct product);
    void deleteProduct(long productId);
}
