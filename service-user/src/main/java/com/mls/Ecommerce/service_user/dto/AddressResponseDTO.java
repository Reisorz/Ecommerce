package com.mls.Ecommerce.service_user.dto;

public record AddressResponseDTO(
        Long id,
        String street,
        String city,
        String state,
        String postalCode,
        String country,
        boolean isDefault,
        String alias
) {}