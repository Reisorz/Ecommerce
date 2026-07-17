package com.mls.Ecommerce.service_user.util;

import com.mls.Ecommerce.service_user.dto.UserResponseDTO;
import com.mls.Ecommerce.service_user.model.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = AddressMapper.class)
public interface UserMapper {
    UserResponseDTO toResponseDTO(UserEntity entity);
}