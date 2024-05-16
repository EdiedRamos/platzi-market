package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.DomainCategory;
import com.platzi.market.persistence.entity.Category;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "description", target = "category"),
            @Mapping(source = "state", target = "active")
    })
    DomainCategory toDomainCategory(Category category);

    @InheritInverseConfiguration
    @Mapping(target = "products", ignore = true)
    Category toCategory(DomainCategory domainCategory);
}
