package com.minbeom.EcommerceProjectBackend.domain.user.dto;

import jakarta.validation.constraints.NotBlank;

public record RegisterUserCommand(
        @NotBlank(message = "이름은 필수값입니다.")
        String name,
        @NotBlank(message = "별명은 필수값입니다.")
        String nickName,
        @NotBlank(message = "이메일은 필수값입니다.")
        String email,
        @NotBlank(message = "비밀번호는 필수값입니다.")
        String password,
        @NotBlank(message = "사진은 필수값입니다.")
        String image
) {
}
