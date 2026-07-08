package com.mls.Ecommerce.service_product.service.impl;

import com.mls.Ecommerce.service_product.dto.ProductCreateRequestDTO;
import com.mls.Ecommerce.service_product.exceptions.DuplicateSkuException;
import com.mls.Ecommerce.service_product.util.ProductMapper;
import com.mls.Ecommerce.service_product.dto.ProductResponseDTO;
import com.mls.Ecommerce.service_product.model.ProductEntity;
import com.mls.Ecommerce.service_product.repository.ProductRepository;
import com.mls.Ecommerce.service_product.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductServiceImpl(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }


    @Transactional
    public ProductResponseDTO createProduct(ProductCreateRequestDTO request) {
        if (productRepository.existsBySku(request.sku())) {
            throw new DuplicateSkuException(request.sku());
        }

        ProductEntity product = productMapper.toEntity(request);
        ProductEntity savedProduct = productRepository.save(product);

        return productMapper.toResponseDTO(savedProduct);
    }
}
