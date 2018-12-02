package com.github.fvm.slackey.service.api.v1.commands;

import com.github.fvm.slackey.service.api.v1.commands.ping.domain.dtos.PingRequest;
import com.github.fvm.slackey.service.api.v1.commands.ping.domain.dtos.PongResponse;
import com.github.fvm.slackey.service.api.v1.commands.slash.domain.SlashRequest;
import com.github.fvm.slackey.service.api.v1.commands.slash.domain.SlashResponse;
import org.springframework.web.bind.annotation.PostMapping;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class CommandsDefinitions {

    public interface PingCommandDefinitions {

        @PostMapping
        Mono<PongResponse> ping(PingRequest pingMessage);
    }

    public interface SlashCommandDefinition {
        @PostMapping
        <T extends SlashRequest> Flux<? extends SlashResponse> slash(T request);
    }
}
