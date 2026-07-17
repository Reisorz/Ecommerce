package com.mls.Ecommerce.service_user.util;

import com.mls.Ecommerce.service_user.dto.AddressResponseDTO;
import com.mls.Ecommerce.service_user.dto.AddressRequestDTO;
import com.mls.Ecommerce.service_user.model.AddressEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    AddressResponseDTO toResponseDTO(AddressEntity entity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "user", ignore = true)
    AddressEntity toEntity(AddressRequestDTO dto);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "user", ignore = true)
    void updateEntityFromDTO(AddressRequestDTO dto, @MappingTarget AddressEntity entity);
}