package com.tweteroo.api.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record ClientDTO(
        @NotBlank String username,

        @NotBlank @Pattern(regexp = "^https?://.*\\.(jpg|png)$") String avatar) {

}
