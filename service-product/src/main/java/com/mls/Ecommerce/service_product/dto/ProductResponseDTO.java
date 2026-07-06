package com.mls.Ecommerce.service_product.dto;

import com.mls.Ecommerce.service_product.model.ProductCategory;
import java.math.BigDecimal;

public record ProductResponseDTO(
        Long id,
        String sku,
        String name,
        String description,
        BigDecimal price,
        ProductCategory category,
        Integer availableStock,
        Boolean active
) {}