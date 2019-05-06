package com.gomezrondon.springbasicsecurity.repository;

import com.gomezrondon.springbasicsecurity.entitie.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UsersRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByName(String username);
}
