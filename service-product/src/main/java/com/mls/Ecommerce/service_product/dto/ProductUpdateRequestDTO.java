package com.mls.Ecommerce.service_product.dto;

import com.mls.Ecommerce.service_product.model.ProductCategory;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;

public record ProductUpdateRequestDTO(

        @NotBlank
        @Size(max = 150)
        String name,

        @Size(max = 1000)
        String description,

        @NotNull
        @DecimalMin(value = "0.0", inclusive = false)
        @Digits(integer = 8, fraction = 2)
        BigDecimal price,

        @NotNull
        ProductCategory category
) {}