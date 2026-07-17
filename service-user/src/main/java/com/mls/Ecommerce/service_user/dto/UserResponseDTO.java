package com.mls.Ecommerce.service_user.dto;

import java.util.List;

public record UserResponseDTO(
        String id,
        String email,
        String firstName,
        String lastName,
        String phone,
        List<AddressResponseDTO> addresses
) {}