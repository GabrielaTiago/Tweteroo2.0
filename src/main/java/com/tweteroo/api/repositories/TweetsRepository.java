package com.tweteroo.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroo.api.models.Tweet;

public interface TweetsRepository extends JpaRepository<Tweet, Long> {
    
}
