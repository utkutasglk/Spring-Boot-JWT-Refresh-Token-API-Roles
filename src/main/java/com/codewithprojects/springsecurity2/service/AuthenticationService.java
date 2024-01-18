package com.codewithprojects.springsecurity2.service;

import com.codewithprojects.springsecurity2.dto.JwtAuthenticationResponse;
import com.codewithprojects.springsecurity2.dto.RefreshTokenRequest;
import com.codewithprojects.springsecurity2.dto.SignUpRequest;
import com.codewithprojects.springsecurity2.dto.SigninRequest;
import com.codewithprojects.springsecurity2.entities.User;

public interface AuthenticationService {

    User signup(SignUpRequest signUpRequest);

    JwtAuthenticationResponse signin(SigninRequest signinRequest);


    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);

}
