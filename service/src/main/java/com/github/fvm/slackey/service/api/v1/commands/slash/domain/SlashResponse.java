package com.github.fvm.slackey.service.api.v1.commands.slash.domain;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public abstract class SlashResponse {
    @JsonPOJOBuilder
    public static abstract class Builder {
    }
}
