package com.tweteroo.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.dtos.TweetDTO;
import com.tweteroo.api.services.TweetsService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/tweets")
public class TweetsController {

    @Autowired
    private TweetsService service;

    @PostMapping
    public ResponseEntity<String> create(@RequestBody @Valid TweetDTO data) {
        service.create(data);
        return ResponseEntity.status(HttpStatus.CREATED).body("OK");
    }

}
