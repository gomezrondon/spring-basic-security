package com.gomezrondon.springbasicsecurity;

import com.gomezrondon.springbasicsecurity.entitie.Users;
import com.gomezrondon.springbasicsecurity.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private final UsersRepository repo;

	public Application(UsersRepository repo) {
		this.repo = repo;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Optional<Users> user = repo.findByName("javier");

		System.out.println(">>>>>>>>>>>>>>> User: "+user.get().toString());

	}
}
