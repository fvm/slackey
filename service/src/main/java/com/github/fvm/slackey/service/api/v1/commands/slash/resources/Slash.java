package com.github.fvm.slackey.service.api.v1.commands.slash.resources;

import com.github.fvm.slackey.service.ResourceDefinitions;
import com.github.fvm.slackey.service.api.v1.commands.slash.domain.SlashRequest;
import com.github.fvm.slackey.service.api.v1.commands.slash.domain.SlashResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping(path = "slash")
public class Slash implements ResourceDefinitions.Commands.Slash {

    @Override
    @PostMapping
    @ResponseBody
    public <T extends SlashRequest> Flux<? extends SlashResponse> slash(T request) {

        return null;
    }
}
