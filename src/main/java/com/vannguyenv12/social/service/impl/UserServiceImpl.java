package com.vannguyenv12.social.service.impl;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.vannguyenv12.social.domain.User;
import com.vannguyenv12.social.dto.RegisterDto;
import com.vannguyenv12.social.repository.UserRepository;
import com.vannguyenv12.social.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public User createUser(RegisterDto registerDto) {
        User newUser = new User();
        newUser.setEmail(registerDto.getEmail());
        newUser.setFirstName(registerDto.getFirstName());
        newUser.setMiddleName(registerDto.getMiddleName());
        newUser.setLastName(registerDto.getLastName());
        newUser.setPhone(registerDto.getPhone());

        String hashedPassword = passwordEncoder.encode(registerDto.getPassword());

        newUser.setPassword(hashedPassword);

        return userRepository.save(newUser);
    }

}
