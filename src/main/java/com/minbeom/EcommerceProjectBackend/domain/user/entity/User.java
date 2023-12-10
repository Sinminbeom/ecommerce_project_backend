package com.minbeom.EcommerceProjectBackend.domain.user.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

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

    public User(Long id, String name, String nickName, String email, String password, String image, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
        this.email = email;
        this.password = password;
        this.image = image;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
