package com.github.fvm.slackey.service.api.v1.commands.ping.resources;


import com.github.fvm.slackey.service.api.v1.commands.CommandsDefinitions;
import com.github.fvm.slackey.service.api.v1.commands.ping.domain.dtos.PingRequest;
import com.github.fvm.slackey.service.api.v1.commands.ping.domain.dtos.PongResponse;
import reactor.core.publisher.Mono;

public class PingResource implements CommandsDefinitions.PingCommandDefinitions {
    @Override
    public Mono<PongResponse> ping(PingRequest pingMessage) {

        return null;
    }
}
