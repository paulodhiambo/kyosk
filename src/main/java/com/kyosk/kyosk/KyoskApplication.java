package com.kyosk.kyosk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class KyoskApplication {

    public static void main(String[] args) {
        SpringApplication.run(KyoskApplication.class, args);
    }

}
