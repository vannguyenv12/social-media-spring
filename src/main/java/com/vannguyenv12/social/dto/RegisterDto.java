package com.vannguyenv12.social.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class RegisterDto {
    private String email;
    private String phone;
    private String password;
    private String firstName;
    private String middleName;
    private String lastName;
}
