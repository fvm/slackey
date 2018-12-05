package com.github.fvm.slackey.service.api.v1.commands.ping.resources;


import com.github.fvm.slackey.service.ResourceDefinitions;
import com.github.fvm.slackey.service.api.v1.commands.ping.domain.dtos.PingRequest;
import com.github.fvm.slackey.service.api.v1.commands.ping.domain.dtos.PongResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class Ping implements ResourceDefinitions.Commands.Ping {

    @Override
    @PostMapping
    public Mono<PongResponse> ping(PingRequest pingMessage) {

        return null;
    }
}
