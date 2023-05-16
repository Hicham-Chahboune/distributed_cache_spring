package com.eil;

import com.eil.entity.Contract;
import com.eil.repository.ContractRepository;
import com.eil.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
@EnableCaching
public class DcspApplication {

    public static void main(String[] args) {
        SpringApplication.run(DcspApplication.class, args);
    }

}
