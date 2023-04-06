package com.tweteroo.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweteroo.api.dtos.ClientDTO;
import com.tweteroo.api.models.Client;
import com.tweteroo.api.repositories.AuthRepository;

@Service
public class AuthService {
    
    @Autowired
    private AuthRepository repository;

    public void signup(ClientDTO data){
        repository.save(new Client(data));
    }
}
