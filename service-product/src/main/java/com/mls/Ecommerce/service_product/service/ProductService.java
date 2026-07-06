package com.mls.Ecommerce.service_product.service;

import com.mls.Ecommerce.service_product.dto.ProductCreateRequestDTO;
import com.mls.Ecommerce.service_product.dto.ProductResponseDTO;

public interface ProductService {

    public ProductResponseDTO createProduct(ProductCreateRequestDTO request);
}
