package com.github.fvm.slackey.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * The type Slackey service.
 */
@Service
@EnableWebMvc
@ComponentScan(basePackageClasses = {com.github.fvm.slackey.service.ResourceDefinitions.class})
public class SlackeyService {

}
