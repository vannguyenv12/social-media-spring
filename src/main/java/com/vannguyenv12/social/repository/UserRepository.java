package com.vannguyenv12.social.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vannguyenv12.social.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
