package com.codewithprojects.springsecurity2.service;

import com.codewithprojects.springsecurity2.entities.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface UserService {

    UserDetailsService userDetailsService();

}
