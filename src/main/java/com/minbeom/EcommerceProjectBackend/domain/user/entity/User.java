package com.minbeom.EcommerceProjectBackend.domain.user.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

import java.time.LocalDateTime;

@Getter
@Builder
@Entity
@NoArgsConstructor
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String nickName;
    private String email;
    private String password;
    private String image;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    final private static Long NAME_MAX_LENGTH = 10L;

    public User(Long id, String name, String nickName, String email, String password, String image, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        validateNickname(nickName);
        this.nickName = nickName;
        this.email = email;
        this.password = password;
        this.image = image;
//        this.image = Optional.of(image).orElseThrow(() -> new NullPointerException("image가 null이여"));
        this.createdAt = createdAt == null ? LocalDateTime.now() : createdAt;
        this.updatedAt = updatedAt == null ? LocalDateTime.now() : createdAt;
    }
    private void validateNickname(String nickname) {
        Assert.isTrue(nickname.length() <= NAME_MAX_LENGTH, "최대 길이를 초과했습니다.");
    }
}
