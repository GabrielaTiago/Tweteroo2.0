package com.tweteroo.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.dtos.ClientDTO;
import com.tweteroo.api.services.AuthService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/sign-up")
public class AuthController {

    @Autowired
    private AuthService repository;

    @PostMapping
    public ResponseEntity<String> signup(@RequestBody @Valid ClientDTO req) {
        repository.signup(req);

        return ResponseEntity.status(HttpStatus.CREATED).body("OK");
    }
}
