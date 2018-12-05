package com.github.fvm.slackey;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SlackeyApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SlackeyApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication sa = new SpringApplication(SlackeyApplication.class);
        sa.run(args);
    }

    private static SpringApplicationBuilder configureApplication(SpringApplicationBuilder builder) {
        return builder.sources(SlackeyApplication.class).bannerMode(Banner.Mode.CONSOLE);
    }

}