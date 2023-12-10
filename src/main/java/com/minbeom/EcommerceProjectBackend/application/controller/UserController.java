package com.minbeom.EcommerceProjectBackend.application.controller;

import com.minbeom.EcommerceProjectBackend.domain.user.dto.RegisterUserCommand;
import com.minbeom.EcommerceProjectBackend.domain.user.dto.UserDTO;
import com.minbeom.EcommerceProjectBackend.domain.user.entity.User;
import com.minbeom.EcommerceProjectBackend.domain.user.service.UserReadService;
import com.minbeom.EcommerceProjectBackend.domain.user.service.UserWriteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserWriteService userWriteService;
    private final UserReadService userReadService;

    @PostMapping("/users")
    public UserDTO register(@RequestBody RegisterUserCommand command) {
        return userWriteService.register(command);
    }

}
