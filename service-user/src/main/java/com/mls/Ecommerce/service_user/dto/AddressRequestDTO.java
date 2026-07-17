package com.mls.Ecommerce.service_user.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record AddressRequestDTO(

        @NotBlank(message = "Street is mandatory")
        String street,

        @NotBlank(message = "City is mandatory")
        @Size(max = 100)
        String city,

        @NotBlank(message = "State is mandatory")
        @Size(max = 100)
        String state,

        @NotBlank(message = "Postal code is mandatory")
        @Size(max = 20)
        String postalCode,

        @NotBlank(message = "Country is mandatory")
        @Size(max = 100)
        String country,

        boolean isDefault,

        @Size(max = 50)
        String alias
) {}