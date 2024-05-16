package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.DomainProduct;
import com.platzi.market.persistence.entity.Product;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "state", target = "active"),
            @Mapping(source = "category", target = "category")
    })
    DomainProduct toDomainProduct(Product product);

    List<DomainProduct> toDomainProducts(List<Product> products);

    @InheritInverseConfiguration
    @Mapping(target = "barcode", ignore = true)
    Product toProduct(DomainProduct domainProduct);
}
