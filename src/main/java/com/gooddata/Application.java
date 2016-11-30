package com.gooddata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        final ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(Application.class, args);
    }
}