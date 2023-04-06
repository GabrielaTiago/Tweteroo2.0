package com.tweteroo.api.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record TweetDTO(
    @NotBlank @Size(max = 20) String username,
    @NotBlank @Size(max = 280) String text
    ) {

}
