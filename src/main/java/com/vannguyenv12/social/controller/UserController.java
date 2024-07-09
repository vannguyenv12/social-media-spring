package com.vannguyenv12.social.controller;

import org.springframework.web.bind.annotation.RestController;

import com.vannguyenv12.social.domain.User;
import com.vannguyenv12.social.dto.RegisterDto;
import com.vannguyenv12.social.service.UserService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<User> postMethodName(@RequestBody RegisterDto registerDto) {
        User user = userService.createUser(registerDto);
        return ResponseEntity.created(null).body(user);
    }

}
