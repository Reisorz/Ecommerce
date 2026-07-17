package com.mls.Ecommerce.service_user.dto;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record UserUpdateRequestDTO(

        @Size(max = 100)
        String firstName,

        @Size(max = 100)
        String lastName,

        @Pattern(regexp = "^\\+?[0-9]{7,15}$", message = "Phone number format is invalid")
        String phone
) {}