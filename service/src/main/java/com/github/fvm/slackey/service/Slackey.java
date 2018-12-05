package com.github.fvm.slackey.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/")
public class Slackey implements ResourceDefinitions.Slackey {

    @Override
    @ResponseBody
    @GetMapping
    public String list() {
        return "Hello World";
    }
}
