package com.minbeom.EcommerceProjectBackend.domain.user.dto;

public record UserDTO(
        Long id,
        String name,
        String nickName,
        String email,
        String password,
        String image
) {
}
