package com.codewithprojects.springsecurity2;

import com.codewithprojects.springsecurity2.entities.Role;
import com.codewithprojects.springsecurity2.entities.User;
import com.codewithprojects.springsecurity2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static com.codewithprojects.springsecurity2.entities.Role.ADMIN;

@SpringBootApplication
public class Springsecurity2Application implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;


	public static void main(String[] args) {
		SpringApplication.run(Springsecurity2Application.class, args);
	}

	public void run(String... args){

		User adminAccount = userRepository.findByRole(ADMIN);
		if(null == adminAccount){
			User user = new User();

			user.setEmail("admin@gmail.com");
			user.setFirstName("admin");
			user.setSecondName("admin");
			user.setRole(ADMIN);
			user.setPassword(new BCryptPasswordEncoder().encode("admin"));
			userRepository.save(user);
		}

	}
}
