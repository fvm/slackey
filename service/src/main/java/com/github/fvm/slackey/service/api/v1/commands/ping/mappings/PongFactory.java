package com.github.fvm.slackey.service.api.v1.commands.ping.mappings;

import com.github.fvm.slackey.service.api.v1.commands.ping.domain.entities.Pong;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class PongFactory implements FactoryBean<Pong> {

    @Override
    public Pong getObject() {

        return Pong.builder().build();
    }

    @Override
    public Class<?> getObjectType() {

        return Pong.class;
    }
}
