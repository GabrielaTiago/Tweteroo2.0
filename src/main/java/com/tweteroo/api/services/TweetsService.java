package com.tweteroo.api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweteroo.api.dtos.TweetDTO;
import com.tweteroo.api.models.Client;
import com.tweteroo.api.models.Tweet;
import com.tweteroo.api.repositories.AuthRepository;
import com.tweteroo.api.repositories.TweetsRepository;

@Service
public class TweetsService {

    @Autowired
    private AuthRepository clientRepository;

    @Autowired
    private TweetsRepository tweetsRepository;

    public void create(TweetDTO data) {
        Optional<Client> client = clientRepository.findByUsername(data.username());

        if (client.isPresent()) {
            tweetsRepository.save(new Tweet(client.get().getAvatar(), data));
        }
    }

}
