package com.chakri.curefit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CurefitApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurefitApplication.class, args);
    }

}
