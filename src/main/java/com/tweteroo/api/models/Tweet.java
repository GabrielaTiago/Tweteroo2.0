package com.tweteroo.api.models;

import javax.print.DocFlavor.STRING;

import com.tweteroo.api.dtos.TweetDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 20, nullable = false)
    private String username;

    @Column(nullable = false)
    private String avatar;

    @Column(length = 280, nullable = false)
    private String text;

    public Tweet(String avatar, TweetDTO data) {
        this.username = data.username();
        this.avatar = avatar;
        this.text = data.text();
    }
}
