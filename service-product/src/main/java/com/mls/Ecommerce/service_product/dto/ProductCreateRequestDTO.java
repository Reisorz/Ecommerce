package com.mls.Ecommerce.service_product.dto;

import com.mls.Ecommerce.service_product.model.ProductCategory;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;

public record ProductCreateRequestDTO(

        @Schema(description = "Unique stock keeping unit", example = "TOY-PUZZLE-1000")
        @NotBlank(message = "SKU is mandatory")
        @Size(max = 50)
        String sku,

        @Schema(description = "Product name", example = "1000-Piece Jigsaw Puzzle - Mountain Landscape")
        @NotBlank(message = "Name is mandatory")
        @Size(max = 150)
        String name,

        @Schema(description = "Product description", example = "A fun puzzle game for all ages")
        @Size(max = 1000)
        String description,

        @Schema(description = "Product price", example = "19.99")
        @NotNull(message = "Price is mandatory")
        @DecimalMin(value = "0.0", inclusive = false, message = "Price must be greater than 0")
        @Digits(integer = 8, fraction = 2 , message = "Price must have a maximum of 8 integral digits and 2 decimals")
        BigDecimal price,

        @Schema(description = "Product category", example = "TOYS")
        @NotNull(message = "Category is mandatory")
        ProductCategory category,

        @Schema(description = "Initial stock quantity", example = "100")
        @NotNull(message = "Initial stock is mandatory")
        @Min(value = 0, message = "Stock cannot be negative")
        Integer stockQuantity
) {}