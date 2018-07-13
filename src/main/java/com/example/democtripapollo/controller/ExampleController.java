package com.example.democtripapollo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class ExampleController {

    @Value("${test:test}")
    private String test;

    @GetMapping("/getconfig")
    public Mono<String> getConfig() {
        String resp = String.format("config key: test, value: %s", test);
        log.info(resp);
        return Mono.just(resp);
    }
}
