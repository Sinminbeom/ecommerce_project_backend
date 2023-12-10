package com.minbeom.EcommerceProjectBackend.domain.user.repository;

import com.minbeom.EcommerceProjectBackend.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}
