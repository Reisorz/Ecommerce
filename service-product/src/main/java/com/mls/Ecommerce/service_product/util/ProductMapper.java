package com.mls.Ecommerce.service_product.mapper;

import com.mls.Ecommerce.service_product.dto.ProductCreateRequestDTO;
import com.mls.Ecommerce.service_product.dto.ProductResponseDTO;
import com.mls.Ecommerce.service_product.dto.ProductUpdateRequestDTO;
import com.mls.Ecommerce.service_product.model.ProductEntity;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(target = "availableStock", expression = "java(entity.getAvailableStock())")
    ProductResponseDTO toResponseDTO(ProductEntity entity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "reservedQuantity", ignore = true)
    @Mapping(target = "active", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    ProductEntity toEntity(ProductCreateRequestDTO dto);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "sku", ignore = true)
    @Mapping(target = "stockQuantity", ignore = true)
    @Mapping(target = "reservedQuantity", ignore = true)
    @Mapping(target = "active", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    void updateEntityFromDTO(ProductUpdateRequestDTO dto, @MappingTarget ProductEntity entity);
}