package com.minbeom.EcommerceProjectBackend.domain.user.dto;

public record RegisterUserCommand(
        String name,
        String nickName,
        String email,
        String password,
        String image
) {
}
