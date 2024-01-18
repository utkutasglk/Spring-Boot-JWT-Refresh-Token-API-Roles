package com.codewithprojects.springsecurity2.dto;

import lombok.Data;

@Data
public class SignUpRequest {

    private String firstName;

    private String lastName;

    private String email;

    private String password;


}
