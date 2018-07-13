package com.example.democtripapollo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Runner implements CommandLineRunner {

    @Value("${spring.datasource.url}")
    private String url;

    @Override
    public void run(String... args) throws Exception {
        log.info("==================== spring.datasource.url: {}", url);
    }
}
