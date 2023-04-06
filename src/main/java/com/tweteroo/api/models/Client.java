package com.tweteroo.api.models;

import com.tweteroo.api.dtos.ClientDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 20, nullable = false)
    private String username;

    @Column(nullable = false)
    private String avatar;

    public Client(ClientDTO data) {
        this.username = data.username();
        this.avatar = data.avatar();
    }
}
