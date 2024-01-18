package com.codewithprojects.springsecurity2.dto;

import lombok.Data;

@Data
public class SigninRequest {

    private String email;
    private String password;

}
