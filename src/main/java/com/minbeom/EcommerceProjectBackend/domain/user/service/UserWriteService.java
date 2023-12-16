package com.minbeom.EcommerceProjectBackend.domain.user.service;

import com.minbeom.EcommerceProjectBackend.domain.user.dto.RegisterUserCommand;
import com.minbeom.EcommerceProjectBackend.domain.user.dto.UserDTO;
import com.minbeom.EcommerceProjectBackend.domain.user.entity.User;
import com.minbeom.EcommerceProjectBackend.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class UserWriteService {
    private final UserRepository userRepository;

    public UserDTO register(RegisterUserCommand command) {
        User user = User.builder()
                .name(command.name())
                .nickName(command.nickName())
                .email(command.email())
                .password(command.password())
                .image(command.image())
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();
        userRepository.save(user);
        return toDTO(user);
    }

    private UserDTO toDTO(User user) {
        return new UserDTO(user.getId(), user.getName(), user.getNickName(), user.getEmail(), user.getPassword(), user.getImage());
    }
}
