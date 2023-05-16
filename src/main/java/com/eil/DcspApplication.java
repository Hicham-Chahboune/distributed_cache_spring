package com.eil;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DcspApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DcspApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
