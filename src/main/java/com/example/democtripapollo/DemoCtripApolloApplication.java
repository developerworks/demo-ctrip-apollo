package com.example.democtripapollo;

import com.example.democtripapollo.listener.ConfigurationChangeListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoCtripApolloApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoCtripApolloApplication.class, args);
    }

    @Bean
    public ConfigurationChangeListener configurationChangeListener() {
        return new ConfigurationChangeListener();
    }
}
