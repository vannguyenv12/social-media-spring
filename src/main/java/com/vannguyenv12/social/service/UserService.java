package com.vannguyenv12.social.service;

import com.vannguyenv12.social.domain.User;
import com.vannguyenv12.social.dto.RegisterDto;

public interface UserService {
    public User createUser(RegisterDto registerDto);
}
