package com.mls.Ecommerce.service_product.dto;

import com.mls.Ecommerce.service_product.model.ProductCategory;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;

public record ProductCreateRequestDTO(

        @NotBlank(message = "SKU is mandatory")
        @Size(max = 50)
        String sku,

        @NotBlank(message = "Name is mandatory")
        @Size(max = 150)
        String name,

        @Size(max = 1000)
        String description,

        @NotNull(message = "Price is mandatory")
        @DecimalMin(value = "0.0", inclusive = false, message = "Price must be greater than 0")
        @Digits(integer = 8, fraction = 2)
        BigDecimal price,

        @NotNull(message = "Category is mandatory")
        ProductCategory category,

        @NotNull(message = "Initial stock is mandatory")
        @Min(value = 0, message = "Stock cannot be negative")
        Integer stockQuantity
) {}