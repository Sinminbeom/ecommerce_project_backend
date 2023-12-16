package com.minbeom.EcommerceProjectBackend.application.controller;

import com.minbeom.EcommerceProjectBackend.domain.user.dto.RegisterUserCommand;
import com.minbeom.EcommerceProjectBackend.domain.user.dto.UserDTO;
import com.minbeom.EcommerceProjectBackend.domain.user.service.UserReadService;
import com.minbeom.EcommerceProjectBackend.domain.user.service.UserWriteService;
import com.minbeom.EcommerceProjectBackend.exception.InvalidParameterException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserWriteService userWriteService;
    private final UserReadService userReadService;

    @PostMapping("/users")
    public UserDTO register(@Valid @RequestBody RegisterUserCommand command, BindingResult result) {
        if (result.hasErrors()) {
            throw new InvalidParameterException(result);
        }
        return userWriteService.register(command);
    }

}
