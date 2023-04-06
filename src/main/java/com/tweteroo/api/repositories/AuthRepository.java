package com.tweteroo.api.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroo.api.models.Client;

public interface AuthRepository extends JpaRepository<Client, Long> {
    
    Optional<Client> findByUsername(String username);
}
