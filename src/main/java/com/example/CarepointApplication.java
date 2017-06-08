package com.example;

import com.example.domain.User;
import com.example.repositories.UserRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CarepointApplication {

	@Bean
	InitializingBean saveData(UserRepository repo){
		return () -> {
			repo.save(new User("mariafdez23", "pooimsci13", "mariafdez23@yahoo.es", "María"));
            repo.save(new User("manuelortegaOAS", "asidiuf90c", "mortegaoas@oas.es", "Manuel"));
            repo.save(new User("elisaperez1985", "ls8udsf9s0", "elisa1985perez@hotmail.com", "Elisa"));
            repo.save(new User("arturoMendoza12", "mendo918k", "artmend12@yahoo.es", "Arturo"));
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(CarepointApplication.class, args);
	}
}
