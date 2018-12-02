package com.github.fvm.slackey.service.api.v1.commands.ping.domain.entities;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class Ping {
    public final String ping;

    @JsonPOJOBuilder
    public static class PingBuilder {
        /**/
    }
}
