package com.github.fvm.slackey.service.api.v1.commands.slash.resources;

import com.github.fvm.slackey.service.api.v1.commands.CommandsDefinitions;
import com.github.fvm.slackey.service.api.v1.commands.slash.domain.SlashRequest;
import com.github.fvm.slackey.service.api.v1.commands.slash.domain.SlashResponse;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class SlashResource implements CommandsDefinitions.SlashCommandDefinition {

    @Override
    public <T extends SlashRequest> Flux<? extends SlashResponse> slash(T request) {

        return null;
    }
}
