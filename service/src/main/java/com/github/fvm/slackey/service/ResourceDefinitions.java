package com.github.fvm.slackey.service;

import com.github.fvm.slackey.service.api.v1.commands.ping.domain.dtos.PingRequest;
import com.github.fvm.slackey.service.api.v1.commands.ping.domain.dtos.PongResponse;
import com.github.fvm.slackey.service.api.v1.commands.slash.domain.SlashRequest;
import com.github.fvm.slackey.service.api.v1.commands.slash.domain.SlashResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ResourceDefinitions {


    @RequestMapping(path = "/commands/v1")
    public static class Commands {

        @RequestMapping(path = "ping")
        public interface Ping {
            @PostMapping
            @ResponseBody
            Mono<PongResponse> ping(PingRequest pingMessage);
        }

        @RequestMapping(path = "slash")
        public interface Slash {
            @PostMapping
            <T extends SlashRequest> Flux<? extends SlashResponse> slash(T request);
        }

    }
}
