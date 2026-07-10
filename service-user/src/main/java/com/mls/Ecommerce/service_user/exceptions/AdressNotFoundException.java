package com.mls.Ecommerce.service_user.exceptions;

public class AdressNotFoundException extends RuntimeException {
    public AdressNotFoundException(Long id) {
        super("Address not found with ID: " + id);
    }
}
