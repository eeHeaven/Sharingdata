package com.example.sharingdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SharingdataApplication {

    public static void main(String[] args) {
        SpringApplication.run(SharingdataApplication.class, args);
    }

}
