package com.kyosk.kyosk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class KyoskApplication {

    /**
     * Serves as the entry point for the Kyosk Spring Boot application.
     *
     * This method initializes and starts the Spring application context using the {@code KyoskApplication} class
     * as the primary configuration source. It enables auto-configuration, component scanning, and launches
     * the application with the provided command-line arguments.
     *
     * @param args Command-line arguments passed to the application during startup
     */
    public static void main(String[] args) {
        SpringApplication.run(KyoskApplication.class, args);
    }

}
