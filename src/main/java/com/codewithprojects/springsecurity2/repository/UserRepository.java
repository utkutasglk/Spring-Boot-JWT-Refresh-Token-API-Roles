package com.codewithprojects.springsecurity2.repository;

import com.codewithprojects.springsecurity2.entities.Role;
import com.codewithprojects.springsecurity2.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {


    Optional<User> findByEmail(String email);

    User findByRole(Role role);
}
